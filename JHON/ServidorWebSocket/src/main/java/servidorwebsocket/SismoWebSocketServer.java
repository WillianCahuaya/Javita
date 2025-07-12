package servidorwebsocket;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@ServerEndpoint("/sismo")
public class SismoWebSocketServer {

    private static final Set<Session> clients = Collections.synchronizedSet(new HashSet<>());

    @OnOpen
    public void onOpen(Session session) {
        clients.add(session);
        System.out.println("Nuevo cliente conectado: " + session.getId());
    }

    @OnClose
    public void onClose(Session session) {
        clients.remove(session);
        System.out.println("Cliente desconectado: " + session.getId());
    }

    @OnMessage
    public void onMessage(String message, Session session) throws IOException {
        broadcast("Sismo detectado: " + message);
    }

    @OnError
    public void onError(Session session, Throwable throwable) {
        System.out.println("Error en cliente: " + session.getId() + ", " + throwable.getMessage());
        clients.remove(session);
    }

    public static void sendMessageToAllClients(String message) {
        broadcast(message); // Reutiliza el método broadcast existente
    }

    public static Set<Session> getClients() {
        return new HashSet<>(clients); // Devuelve una copia para evitar modificaciones directas
    }

    public static void stopServer() {
        synchronized (clients) {
            for (Session client : clients) {
                try {
                    if (client.isOpen()) {
                        client.close();
                    }
                } catch (IOException e) {
                    System.out.println("Error al cerrar sesión: " + e.getMessage());
                }
            }
            clients.clear();
            System.out.println("Servidor WebSocket detenido.");
        }
    }

    private static void broadcast(String message) {
        synchronized (clients) {
            for (Session client : clients) {
                try {
                    if (client.isOpen()) {
                        client.getBasicRemote().sendText(message);
                    }
                } catch (IOException e) {
                    System.out.println("Error al enviar mensaje a " + client.getId() + ": " + e.getMessage());
                }
            }
        }
    }
}

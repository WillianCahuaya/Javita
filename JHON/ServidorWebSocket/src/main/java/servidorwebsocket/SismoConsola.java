package servidorwebsocket;

import java.util.Scanner;
import java.time.LocalDateTime;

public class SismoConsola {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== Consola de Administración del Sistema de Notificación de Sismos ===");
            System.out.println("1. simular <magnitud> <ubicación> - Simula un evento sísmico");
            System.out.println("2. listar - Muestra los clientes conectados");
            System.out.println("3. detener - Detiene el servidor");
            System.out.println("4. salir - Cierra la consola");
            
            while (true) {
                System.out.print("> ");
                String input = scanner.nextLine();
                String[] parts = input.split(" ");
                
                if (parts.length > 0) { // Verifica que haya al menos un comando
                    if (parts[0].equalsIgnoreCase("simular") && parts.length >= 3) {
                        try {
                            double magnitud = Double.parseDouble(parts[1]);
                            if (magnitud >= 0) { // Validación básica: magnitud no negativa
                                String ubicacion = String.join(" ", java.util.Arrays.copyOfRange(parts, 2, parts.length));
                                String message = String.format("Evento simulado: Magnitud: %.1f, Ubicación: %s, Hora: %s",
                                        magnitud, ubicacion, LocalDateTime.now());
                                SismoWebSocketServer.sendMessageToAllClients(message);
                                System.out.println("Evento enviado: " + message);
                            } else {
                                System.out.println("Error: La magnitud debe ser un número positivo.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Error: La magnitud debe ser un número válido.");
                        } catch (Exception e) {
                            System.out.println("Error al enviar el evento: " + e.getMessage());
                        }
                    } else if (parts[0].equalsIgnoreCase("listar")) {
                        try {
                            System.out.println("Clientes conectados: " + SismoWebSocketServer.getClients().size());
                        } catch (Exception e) {
                            System.out.println("Error al listar clientes: " + e.getMessage());
                        }
                    } else if (parts[0].equalsIgnoreCase("detener")) {
                        try {
                            SismoWebSocketServer.stopServer();
                            System.out.println("Servidor detenido.");
                            break;
                        } catch (Exception e) {
                            System.out.println("Error al detener el servidor: " + e.getMessage());
                        }
                    } else if (parts[0].equalsIgnoreCase("salir")) {
                        System.out.println("Consola cerrada.");
                        break;
                    } else {
                        System.out.println("Comando no reconocido. Intente de nuevo.");
                    }
                } else {
                    System.out.println("Entrada vacía. Intente de nuevo.");
                }
            }
        }
    }
}
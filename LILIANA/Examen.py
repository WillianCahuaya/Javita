import qrcode
texto = "https://drive.google.com/drive/folders/1r93xzJLKQcXfAJCJVpRZOE7gU4UG37LD?q=sharedwith:public%20parent:1r93xzJLKQcXfAJCJVpRZOE7gU4UG37LD"
img = qrcode.make(texto)
img.save("codigo_qr.png")
import os
os.startfile("codigo_qr.png")
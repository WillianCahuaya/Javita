// Importa los módulos necesarios de Angular
import { Component } from '@angular/core';
import { CommonModule } from '@angular/common'; // Para directivas como *ngIf y *ngFor
import { FormsModule } from '@angular/forms'; // Para usar [(ngModel)] en inputs

// Define la estructura de datos para un producto
interface Product {
  id: number;         // Identificador único del producto
  name: string;       // Nombre del producto
  price: number;      // Precio del producto
  image: string;      // URL o ruta de la imagen
  description: string;// Descripción del producto
}

// Decorador que define este archivo como un componente de Angular
@Component({
  selector: 'app-product',                 // Nombre de la etiqueta HTML para usar este componente
  standalone: true,                        // Indica que es un componente independiente
  imports: [CommonModule, FormsModule],    // Módulos que usa este componente
  templateUrl: './product.component.html', // Archivo HTML asociado
  styleUrls: ['./product.component.scss']  // Archivo SCSS asociado para los estilos
})
export class ProductComponent {

  // -------------------------
  // VARIABLES DE ESTADO
  // -------------------------
  searchTerm = '';             // Guarda el texto ingresado en el buscador
  sortOption = 'name';         // Opción de ordenamiento (por nombre, precio asc/desc)
  cart: Product[] = [];        // Lista de productos en el carrito
  selectedProduct: Product | null = null; // Producto actualmente seleccionado para ver detalles
  showCart = true;             // Controla si el carrito está visible o no

  // Alterna la visibilidad del carrito
  toggleCart() {
    this.showCart = !this.showCart;
  }

  // -------------------------
  // LISTA DE PRODUCTOS DISPONIBLES
  // -------------------------
  products: Product[] = [
    { id: 1, name: 'Laptop Pro', price: 1500.50, image: '', description: 'Una potente laptop para profesionales. Cuenta con un procesador de última generación y 16GB de RAM.' },
    { id: 2, name: 'Auriculares Inalámbricos', price: 89.99, image: '', description: 'Auriculares con cancelación de ruido y batería de larga duración. Perfectos para música y llamadas.' },
    { id: 3, name: 'Smartwatch Deportivo', price: 120.00, image: '', description: 'Reloj inteligente con monitor de frecuencia cardíaca, GPS y resistencia al agua. Ideal para deportistas.' },
    { id: 4, name: 'Teléfono Móvil X', price: 850.75, image: '', description: 'El último modelo de smartphone con una cámara impresionante y un rendimiento excepcional.' },
    { id: 5, name: 'Cámara Fotográfica DSLR', price: 620.00, image: '', description: 'Captura fotos de alta calidad con esta cámara réflex digital profesional. Viene con un lente 50mm.' },
    { id: 6, name: "parlante bluetooth", price: 150.00, image: '', description: 'Parlante portátil con sonido envolvente y batería de larga duración. Ideal para fiestas y actividades al aire libre.' },
    { id: 7, name: "mochila de laptop", price: 75.00, image: '', description: 'Mochila resistente y espaciosa para llevar tu laptop y accesorios. Con múltiples compartimentos y diseño ergonómico.' },
  ];

  // -------------------------
  // FILTRAR Y ORDENAR PRODUCTOS
  // -------------------------
  get filteredProducts(): Product[] {
    // Filtrar por texto de búsqueda
    let filtered = this.products.filter(p =>
      p.name.toLowerCase().includes(this.searchTerm.toLowerCase())
    );

    // Ordenar según la opción elegida
    if (this.sortOption === 'priceAsc') {
      filtered = filtered.sort((a, b) => a.price - b.price);
    } else if (this.sortOption === 'priceDesc') {
      filtered = filtered.sort((a, b) => b.price - a.price);
    } else { // Orden alfabético por defecto
      filtered = filtered.sort((a, b) => a.name.localeCompare(b.name));
    }

    return filtered;
  }

  // -------------------------
  // AGREGAR PRODUCTO AL CARRITO
  // -------------------------
  addToCart(product: Product) {
    this.cart.push(product);
    console.log('Producto agregado:', product.name);
  }

  // -------------------------
  // ELIMINAR PRODUCTO DEL CARRITO
  // -------------------------
  removeFromCart(product: Product) {
    this.cart = this.cart.filter(item => item.id !== product.id);
  }

  // -------------------------
  // VER DETALLE DE PRODUCTO
  // -------------------------
  viewProduct(product: Product) {
    this.selectedProduct = product; // Asigna el producto al modal
  }

  // -------------------------
  // CERRAR MODAL DE PRODUCTO
  // -------------------------
  closeModal() {
    this.selectedProduct = null; // Limpia la selección
  }

  // -------------------------
  // CALCULAR TOTAL DEL CARRITO
  // -------------------------
  getTotal(): number {
    return this.cart.reduce((total, item) => total + item.price, 0);
  }

  // -------------------------
  // PROCESO DE PAGO
  // -------------------------
  checkout() {
    alert('¡Proceso de pago iniciado! Total: S/ ' + this.getTotal().toFixed(2));
    this.cart = []; // Vacía el carrito después de pagar
  }

  // -------------------------
  // IMPRIMIR BOLETA EN PDF
  // -------------------------
  printReceipt() {
    // Genera contenido HTML con los productos y el total
    const contenido = `
      <h1>Boleta de compra</h1>
      <ul>
        ${this.cart.map(item => `<li>${item.name} - S/ ${item.price.toFixed(2)}</li>`).join('')}
      </ul>
      <p><strong>Total:</strong> S/ ${this.getTotal().toFixed(2)}</p>
    `;
    
    // Abre nueva ventana y envía contenido para imprimir
    const ventana = window.open('', '_blank', 'width=600,height=700');
    ventana!.document.write(`<html><head><title>Boleta</title></head><body>${contenido}</body></html>`);
    ventana!.document.close();
    ventana!.print();
  }

}

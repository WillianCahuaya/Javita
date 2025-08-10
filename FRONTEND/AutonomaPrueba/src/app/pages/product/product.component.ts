// Importa los módulos necesarios de Angular
import { Component } from '@angular/core';
import { CommonModule } from '@angular/common'; // Para directivas como *ngIf y *ngFor
import { FormsModule } from '@angular/forms'; // Para [(ngModel)]

// Define la estructura de datos para un producto
interface Product {
  id: number;
  name: string;
  price: number;
  image: string;
  description: string;
}

// Decorador que define este archivo como un componente de Angular
@Component({
  selector: 'app-product', // El nombre de la etiqueta HTML para usar este componente
  standalone: true, // Indica que es un componente autónomo
  imports: [CommonModule, FormsModule], // Módulos que usa el componente
  templateUrl: './product.component.html', // Archivo HTML asociado
  styleUrls: ['./product.component.scss'] // Archivo de estilos asociado (SCSS)
})
export class ProductComponent {
  
  // Variables para el estado del componente
  searchTerm = ''; // Valor del input de búsqueda
  sortOption = 'name'; // Opción de ordenamiento seleccionada
  cart: Product[] = []; // Array para almacenar los productos en el carrito
  selectedProduct: Product | null = null; // Producto seleccionado para ver en el modal

  // Array con los datos de los productos
  products: Product[] = [
    { id: 1, name: 'Laptop Pro', price: 1500.50, image: 'https://images.unsplash.com/photo-1611078486028-565492d5351e?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', description: 'Una potente laptop para profesionales. Cuenta con un procesador de última generación y 16GB de RAM.' },
    { id: 2, name: 'Auriculares Inalámbricos', price: 89.99, image: 'https://images.unsplash.com/photo-1546435770-a3e4304e6c38?q=80&w=2071&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', description: 'Auriculares con cancelación de ruido y batería de larga duración. Perfectos para música y llamadas.' },
    { id: 3, name: 'Smartwatch Deportivo', price: 120.00, image: 'https://images.unsplash.com/photo-1579586337278-f29a0a7d8346?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', description: 'Reloj inteligente con monitor de frecuencia cardíaca, GPS y resistencia al agua. Ideal para deportistas.' },
    { id: 4, name: 'Teléfono Móvil X', price: 850.75, image: 'https://images.unsplash.com/photo-1601053163013-17631ce1d670?q=80&w=1932&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', description: 'El último modelo de smartphone con una cámara impresionante y un rendimiento excepcional.' },
    { id: 5, name: 'Cámara Fotográfica DSLR', price: 620.00, image: 'https://images.unsplash.com/photo-1510125585098-508b5e7d800b?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', description: 'Captura fotos de alta calidad con esta cámara réflex digital profesional. Viene con un lente 50mm.' }
  ];

  // Getter que filtra y ordena los productos dinámicamente
  get filteredProducts(): Product[] {
    // 1. Filtrar los productos por el término de búsqueda
    let filtered = this.products.filter(p =>
      p.name.toLowerCase().includes(this.searchTerm.toLowerCase())
    );

    // 2. Ordenar los productos según la opción seleccionada
    if (this.sortOption === 'priceAsc') {
      filtered = filtered.sort((a, b) => a.price - b.price);
    } else if (this.sortOption === 'priceDesc') {
      filtered = filtered.sort((a, b) => b.price - a.price);
    } else { // Por defecto, ordena por nombre
      filtered = filtered.sort((a, b) => a.name.localeCompare(b.name));
    }

    return filtered;
  }

  // Método para agregar un producto al carrito
  addToCart(product: Product) {
    this.cart.push(product);
    console.log('Producto agregado:', product.name);
  }

  // Método para mostrar el modal de un producto
  viewProduct(product: Product) {
    this.selectedProduct = product;
  }

  // Método para cerrar el modal
  closeModal() {
    this.selectedProduct = null;
  }

  // Método para calcular el total del carrito
  getTotal(): number {
    return this.cart.reduce((total, item) => total + item.price, 0);
  }

  // Método placeholder para la acción de pagar
  checkout() {
    alert('¡Proceso de pago iniciado! Total: S/ ' + this.getTotal().toFixed(2));
    this.cart = []; // Vacía el carrito después de "pagar"
  }
}



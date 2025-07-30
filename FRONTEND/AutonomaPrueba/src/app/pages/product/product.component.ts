import { Component } from '@angular/core';
import { ApiService, User } from '../../services/api.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-product',
  imports: [CommonModule],
  templateUrl: './product.component.html',
  styleUrl: './product.component.scss'
})
export class ProductComponent {

  message = '¡Bienvenido a Angular 20!';

  users: User[] = [];

  constructor(private api: ApiService) { }

  ngOnInit() {
    this.api.getUsers().subscribe({
      next: data => this.users = data,
      error: err => console.error('Error al cargar users', err)
    });
  }

}

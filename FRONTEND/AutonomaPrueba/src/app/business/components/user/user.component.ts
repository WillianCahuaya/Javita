import { Component } from '@angular/core';
import { ApiService, User } from '../../apis/user.api';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms'; // ✅ Necesario para ngModel

@Component({
  selector: 'app-user',
  standalone: true, // ✅ Componente independiente
  imports: [CommonModule, FormsModule], // ✅ FormsModule para ngModel
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.scss'] // ✅ Corregido styleUrls
})
export class UserComponent {

  message = '¡Bienvenido a Angular 20!';
  users: User[] = [];

  // ✅ Objeto usuario inicializado con sus propiedades
  usuario = {
    nombre: '',
    correo: '',
    password: ''
  };

  constructor(private api: ApiService) { }

  ngOnInit() {
    this.api.getUsers().subscribe({
      next: data => this.users = data,
      error: err => console.error('Error al cargar usuarios', err)
    });
  }

  // ✅ Método para registrar usuario
  onSubmitRegistro() {
    console.log('Formulario enviado:', this.usuario);

    // Ejemplo para enviar a la API
    // this.api.addUser(this.usuario).subscribe({
    //   next: res => console.log('Usuario registrado', res),
    //   error: err => console.error('Error al registrar usuario', err)
    // });
  }
}

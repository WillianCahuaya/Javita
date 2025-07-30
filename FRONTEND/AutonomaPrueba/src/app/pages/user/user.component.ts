import { Component } from '@angular/core';
import { ApiService, User } from '../../services/api.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-user',
  imports: [CommonModule],
  templateUrl: './user.component.html',
  styleUrl: './user.component.scss'
})
export class UserComponent {

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

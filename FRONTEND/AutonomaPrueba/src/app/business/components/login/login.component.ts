import { CommonModule } from "@angular/common";
import { Component } from "@angular/core";
import { FormsModule } from "@angular/forms";

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent {
  username: string = '';
  password: string = '';

  onSubmit() {
    if (!this.username || !this.password) {
      alert('⚠️ Por favor, complete todos los campos.');
      return;
    }

    // Aquí iría la lógica real de inicio de sesión
    console.log('Usuario:', this.username, 'Contraseña:', this.password);
  }
}




import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.sass'
})
export class LoginComponent implements OnInit {

  username: string = 'wcahuaya';
  password: string = '12345';
  rememberMe: boolean = false;

  constructor (
    private readonly router: Router
  ) {
  }

  ngOnInit() {
  }

  public signIn() {
    if (this.username === 'wcahuaya' && this.password === '12345') {
      console.log('Logueando usuario');
      this.router.navigate(['home']);
    }
  }

  public signUp() {
    console.log('Registrar nuevo usuario');
  }

  private setUser(userTemp: any) {
    console.log('Asignar usuario');
  }

  public reloadPage(): void {
    window.location.reload();
  }

}

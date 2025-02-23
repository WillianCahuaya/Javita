import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {

  projectName = 'Autonoma Web';
  linuxImage = './scrum.png';

  public mostrandoMensaje(mensaje: string) {
    console.log('mostrandoMensaje', mensaje);
  }

}

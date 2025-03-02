import { Component } from '@angular/core';

@Component({
  selector: 'app-template',
  standalone: true,
  imports: [],
  templateUrl: './template.component.html',
  styleUrl: './template.component.sass'
})
export class TemplateComponent {

  projectName = 'Autonoma Web';
  linuxImage = './scrum.png';

  public mostrandoMensaje(mensaje: string) {
    console.log('mostrandoMensaje', mensaje);
  }

}

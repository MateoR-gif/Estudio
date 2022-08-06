import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-empleado',
  templateUrl: './empleado.component.html',
  styleUrls: ['./empleado.component.css']
})
export class EmpleadoComponent implements OnInit {

  private nombre = 'Alberto';
  apellido = 'Camelo';
  edad = 20;

  habilitador = false;

  isRegistered = false;

  actualizarHabilitador(){
      this.habilitador = !this.habilitador;
      this.isRegistered = !this.isRegistered;
  }

  copiar(){
    alert("Copiame esta")
  }

  constructor() { }

  getNombre(){
    return this.nombre;
  }

  ngOnInit(): void {
  }

}

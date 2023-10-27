import { Component } from '@angular/core';
import { CatalogoService } from 'src/app/services/catalogo.service';

@Component({
  selector: 'app-catalogo',
  templateUrl: './catalogo.component.html',
  styleUrls: ['./catalogo.component.css'],
})
export class CatalogoComponent {
  constructor(private catalogoService: CatalogoService) {}
  pacchetto: any;

  getAllPacchetti() {
    this.catalogoService
      .getPacchetti()
      .subscribe((dati) => (this.pacchetto = dati));
    console.log(this.pacchetto);
  }
}

import { Component, OnInit } from "@angular/core";
import { Pacchetto } from "src/app/models/pacchetto.model";
import { Prenotazione } from "src/app/models/prenotazione.model";
import { CatalogoService } from "src/app/services/catalogo.service";
import { PrenotazioneService } from "src/app/services/prenotazione.service";

@Component({
  selector: "app-catalogo",
  templateUrl: "./catalogo.component.html",
  styleUrls: ["./catalogo.component.css"],
})
export class CatalogoComponent implements OnInit {
  constructor(private catalogoService: CatalogoService) {}
  ngOnInit(): void {
    this.catalogoService
      .getPacchetti()
      .subscribe((dati) => (this.pacchetto = dati));
    console.log(this.pacchetto);
  }
  pacchetto: any;
}

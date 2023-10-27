import { Component, OnInit } from "@angular/core";
import { CatalogoService } from "src/app/services/catalogo.service";

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

  getAllPacchetti() {}
}

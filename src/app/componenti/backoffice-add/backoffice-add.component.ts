import { CatalogoService } from "src/app/services/catalogo.service";
import { Component, OnInit } from "@angular/core";
import { Mete } from "src/app/models/mete.model";
import { NgForm } from "@angular/forms";
import { Pacchetto } from "src/app/models/pacchetto.model";

@Component({
  selector: "app-backoffice-add",
  templateUrl: "./backoffice-add.component.html",
  styleUrls: ["./backoffice-add.component.css"],
})
export class BackofficeADDComponent implements OnInit {
  nome!: string;
  descrizione!: string;
  meta!: string;
  costo!: number;
  disponibilita!: number;
  assicurazione!: boolean;
  vaccino!: boolean;
  passaporto!: boolean;
  giornoPartenza!: Date;
  giornoRitorno!: Date;
  img!: string;
  pacchetti: Pacchetto[] = [];
  mete: any;
  constructor(private catalogoService: CatalogoService) {}
  ngOnInit(): void {
    // this.mete = this.catalogoService
    //   .getMete()
    //   .subscribe((payload: Payload<Mete>) => {
    //     this.mete = payload.result.map((response: getMetabyId) => {
    //       return <Mete>{
    //         id: response.id,
    //         citta: response.citta,
    //       };
    //     });
    //   });
    // console.log(this.mete);
  }

  addPacchetto() {
    // let metaP = this.catalogoService.getMetaById(this.meta.id);
    let nuovoPacchetto: Pacchetto; //= new Pacchetto
    //   this.nome,
    //   this.descrizione,
    //   this.meta,
    //   this.costo,
    //   this.disponibilita,
    //   this.assicurazione,
    //   this.vaccino,
    //   this.passaporto,
    //   this.giornoPartenza,
    //   this.giornoRitorno
    // );
    this.catalogoService
      .addPacchetti(nuovoPacchetto)
      .subscribe((dati) => console.log(dati));
  }
}

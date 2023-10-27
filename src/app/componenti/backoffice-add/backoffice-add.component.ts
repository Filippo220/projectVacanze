import { CatalogoService } from 'src/app/services/catalogo.service';
import { Component, OnInit } from '@angular/core';
import { Mete } from 'src/app/models/mete.model';
import { NgForm } from '@angular/forms';
import { Pacchetto } from 'src/app/models/pacchetto.model';

@Component({
  selector: 'app-backoffice-add',
  templateUrl: './backoffice-add.component.html',
  styleUrls: ['./backoffice-add.component.css'],
})
export class BackofficeADDComponent implements OnInit {
  nome!: string;
  descrizione!: string;
  meta!: Mete;
  costo!: number;
  disponibilita!: number;
  assicurazione!: boolean;
  vaccino!: boolean;
  passaporto!: boolean;
  giornoPartenza!: Date;
  giornoRitorno!: Date;
  img!: string;
  pacchetti: Pacchetto[] = [];
  mete: Mete[] = [];
  constructor(private catalogoService: CatalogoService) {}
  ngOnInit(): void {
    this.catalogoService.getMete().subscribe();
    console.log(this.meta);
  }

  addPacchetto() {
    const nuovoPacchetto: Pacchetto = new Pacchetto(
      this.nome,
      this.descrizione,
      this.meta,
      this.costo,
      this.disponibilita,
      this.assicurazione,
      this.vaccino,
      this.passaporto,
      this.giornoPartenza,
      this.giornoRitorno
    );
    this.catalogoService
      .addPacchetti(nuovoPacchetto)
      .subscribe((dati) => console.log(dati));
  }
}

import { Component } from "@angular/core";
import { Pacchetto } from "src/app/models/pacchetto.model";
import { Prenotazione } from "src/app/models/prenotazione.model";
import { PrenotazioneService } from "src/app/services/prenotazione.service";

@Component({
  selector: "app-prenotazione",
  templateUrl: "./prenotazione.component.html",
  styleUrls: ["./prenotazione.component.css"],
})
export class PrenotazioneComponent {
  numPartecipanti: number;
  nomeUtente: string;
  pacchetto: Pacchetto;
  convalida: boolean;

  constructor(private prenotazioneService: PrenotazioneService) {}
  onAddPrenotazione() {
    let nuovaPrenotazione: Prenotazione = new Prenotazione(
      this.numPartecipanti,
      this.nomeUtente,
      this.pacchetto,
      this.convalida
    );
    this.prenotazioneService
      .aggiungiPrenotazione(nuovaPrenotazione)
      .subscribe((data) => console.log(data));
  }
}

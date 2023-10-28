import { Pacchetto } from "./pacchetto.model";

export class Prenotazione {
  numPartecipanti: number;
  nomeUtente: string;
  pacchetto: Pacchetto;
  convalida: boolean;
  prezzoFinale: number;

  constructor(
    numPartecipanti: number,
    nomeUtente: string,
    pacchetto: Pacchetto,
    convalida: boolean
  ) {
    this.numPartecipanti = numPartecipanti;
    this.nomeUtente = nomeUtente;
    this.pacchetto = pacchetto;
    this.convalida = convalida;
    this.prezzoFinale = pacchetto.costo * numPartecipanti;
  }
}

import { Mete } from './mete.model';

export class Pacchetto {
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

  constructor(
    nome: string,
    descrizione: string,
    meta: Mete,
    costo: number,
    disponibilita: number,
    assicurazione: boolean,
    vaccino: boolean,
    passaporto: boolean,
    giornoPartenza: Date,
    giornoRitorno: Date
  ) {
    this.nome = nome;
    this.descrizione = descrizione;
    this.meta = meta;
    this.costo = costo;
    this.disponibilita = disponibilita;
    this.assicurazione = assicurazione;
    this.vaccino = vaccino;
    this.passaporto = passaporto;
    this.giornoPartenza = giornoPartenza;
    this.giornoRitorno = giornoRitorno;
  }
}

export class Mete {
  id!: number;
  citta!: string;
  stato!: string;
  continente!: string;

  constructor(id: number, citta: string, stato: string, continente: string) {
    this.id = id;
    this.citta = citta;
    this.stato = stato;
    this.continente = continente;
  }
}

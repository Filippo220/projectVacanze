import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Prenotazione } from "../models/prenotazione.model";
import { Observable } from "rxjs";

@Injectable({
  providedIn: "root",
})
export class PrenotazioneService {
  constructor(private http: HttpClient) {}
  urlP = "http://localhost:8080/prenotazioni";

  aggiungiPrenotazione(prenotazione: Prenotazione): Observable<object> {
    return this.http.post(this.urlP, prenotazione);
  }
}

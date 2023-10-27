import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Pacchetto } from '../models/pacchetto.model';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class CatalogoService {
  urlP = 'http://localhost:8080/pacchetti/add';
  urlM = 'http://localhost:8080/mete/all';
  constructor(private http: HttpClient) {}

  getPacchetti() {
    return this.http.get(this.urlP);
  }

  addPacchetti(pacchetto: Pacchetto): Observable<string> {
    console.log(pacchetto);
    return this.http.post(this.urlP, pacchetto, { responseType: 'text' });
  }

  getMete() {
    return this.http.get(this.urlM);
  }
}

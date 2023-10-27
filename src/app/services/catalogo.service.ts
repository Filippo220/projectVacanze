import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Pacchetto } from "../models/pacchetto.model";
import { Observable } from "rxjs";
import { Mete } from "../models/mete.model";

@Injectable({
  providedIn: "root",
})
export class CatalogoService {
  urlD = "http://localhost:8080/pacchetti/all";
  urlP = "http://localhost:8080/pacchetti/add";
  urlM = "http://localhost:8080/mete/all";
  urlC = "http://localhost:8080/mete/";
  constructor(private http: HttpClient) {}

  getPacchetti() {
    return this.http.get(this.urlD);
  }

  addPacchetti(pacchetto: Pacchetto): Observable<string> {
    console.log(pacchetto);
    return this.http.post(this.urlP, pacchetto, { responseType: "text" });
  }

  getMete() {
    return this.http.get(this.urlM);
  }

  // getMetaById(id: any): Promise<Mete> {
  //   return new Promise((resolve, reject) => {
  //     console.log(id);
  //     this.http
  //       .get(this.urlC + id)
  //       .toPromise()
  //       .then((data) => {
  //         console.log(data);
  //         resolve(data as Mete);
  //       })
  //       .catch((e) => {
  //         console.error(e);
  //         reject(e);
  //       });
  //   });
}

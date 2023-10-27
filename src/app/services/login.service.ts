import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from '../models/user.model';

@Injectable({
  providedIn: 'root',
})
export class LoginService {
  utenti: User[] = [];
  url =
    'https://projectvacanze-default-rtdb.europe-west1.firebasedatabase.app/users.json';
  constructor(private http: HttpClient) {}

  addClienti(body: {}) {
    return this.http.post(this.url, body);
  }

  allClienti() {
    return this.http.get(this.url);
  }
}

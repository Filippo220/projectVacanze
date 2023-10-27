import { LoginService } from 'src/app/services/login.service';
import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
})
export class HomeComponent {
  persone: any;
  constructor(private loginService: LoginService) {}

  getUtenti() {
    this.loginService.allClienti().subscribe((dati: any) => {
      this.persone = Object.keys(dati).map((key) => {
        return dati[key];
      });
      console.log(this.persone);
    });
  }
}

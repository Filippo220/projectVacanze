import { Component } from '@angular/core';

@Component({
  selector: 'app-destinazioni',
  templateUrl: './destinazioni.component.html',
  styleUrls: ['./destinazioni.component.css'],
})
export class DestinazioniComponent {
  continenti = [
    { nome: 'Asia', img: './assets/destinazioni-vid/AsiaVid.mp4' },
    { nome: 'America', img: './assets/destinazioni-vid/AmericaVid.mp4' },
    { nome: 'Africa', img: './assets/destinazioni-vid/AfricaVid.mp4' },
    { nome: 'Europa', img: './assets/destinazioni-vid/EuropaVid.mp4' },
    { nome: 'Oceania', img: './assets/destinazioni-vid/OceaniaVid.mp4' },
  ];
}

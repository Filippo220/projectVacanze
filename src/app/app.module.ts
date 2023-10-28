import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MenuComponent } from './componenti/menu/menu.component';
import { SidebarComponent } from './componenti/sidebar/sidebar.component';
import { CatalogoComponent } from './componenti/catalogo/catalogo.component';
import { ContattiComponent } from './componenti/contatti/contatti.component';
import { LoginComponent } from './componenti/login/login.component';
import { FormsModule } from '@angular/forms';
import { LoginBackOfficeComponent } from './componenti/login-back-office/login-back-office.component';
import { DestinazioniComponent } from './componenti/destinazioni/destinazioni.component';
import { HomeComponent } from './componenti/home/home.component';
import { BackofficeADDComponent } from './componenti/backoffice-add/backoffice-add.component';
import { PrenotazioneComponent } from './componenti/prenotazione/prenotazione.component';

@NgModule({
  declarations: [
    AppComponent,
    MenuComponent,
    SidebarComponent,
    CatalogoComponent,
    ContattiComponent,
    LoginComponent,
    LoginBackOfficeComponent,
    DestinazioniComponent,
    HomeComponent,
    BackofficeADDComponent,
    PrenotazioneComponent,
  ],
  imports: [BrowserModule, AppRoutingModule, FormsModule, HttpClientModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}

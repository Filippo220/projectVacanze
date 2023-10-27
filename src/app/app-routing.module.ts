import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CatalogoComponent } from './componenti/catalogo/catalogo.component';
import { ContattiComponent } from './componenti/contatti/contatti.component';
import { LoginComponent } from './componenti/login/login.component';
import { LoginBackOfficeComponent } from './componenti/login-back-office/login-back-office.component';
import { DestinazioniComponent } from './componenti/destinazioni/destinazioni.component';
import { HomeComponent } from './componenti/home/home.component';
import { BackofficeADDComponent } from './componenti/backoffice-add/backoffice-add.component';

const routes: Routes = [
  { path: 'home', component: BackofficeADDComponent },
  { path: 'catalogo', component: CatalogoComponent },
  { path: 'destinazioni', component: DestinazioniComponent },
  { path: 'contatti', component: ContattiComponent },
  { path: 'login', component: LoginComponent },
  { path: 'loginAdmin', component: LoginBackOfficeComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}

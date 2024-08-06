import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouteReuseStrategy } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';

import { NavParams, IonicModule, IonicRouteStrategy } from '@ionic/angular';

import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';

import { ContatosPageModule } from './contatos/contatos.module';
import { ContatoService } from 'src/services/contato.service';

@NgModule({
  declarations: [AppComponent],
  imports: [BrowserModule, HttpClientModule, IonicModule.forRoot(), AppRoutingModule, ContatosPageModule],
  providers: [{ provide: RouteReuseStrategy, useClass: IonicRouteStrategy }, NavParams, ContatoService],
  bootstrap: [AppComponent],
})
export class AppModule {}

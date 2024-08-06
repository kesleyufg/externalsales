import { Component, OnInit } from '@angular/core';
import { NavController, NavParams } from '@ionic/angular';
import { ContatoService } from '../../services/contato.service';
import { ContatoDTO } from 'src/models/contato.dto';

@Component({
  selector: 'app-contatos',
  templateUrl: './contatos.page.html',
  styleUrls: ['./contatos.page.scss'],
})
export class ContatosPage implements OnInit {

  contatos: ContatoDTO[] =[];

  constructor(
    public navCtrl: NavController,
    public navParams: NavParams,
    public contatoService: ContatoService) {
  }

  ngOnInit() {
    this.contatoService.findAll()
      .subscribe(response => {
        this.contatos = response;
      }, error => { });
  }

}

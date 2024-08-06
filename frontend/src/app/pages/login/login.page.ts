import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { InicioPage } from '../inicio/inicio.page';

@Component({
  selector: 'app-login',
  templateUrl: './login.page.html',
  styleUrls: ['./login.page.scss'],
})
export class LoginPage implements OnInit {

  constructor(private route: Router) {}
  
  goHomePage() {
    this.route.navigate(['/home']);
  }

  ngOnInit() {
  }

}




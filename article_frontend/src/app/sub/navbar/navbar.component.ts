import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { AuthenticationService } from 'src/app/services/login/authentication.service';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.scss']
})
export class NavbarComponent {

  checkT: boolean | undefined;

  constructor(
    private authentication: AuthenticationService,
    private router: Router
  ){}

  logoutUser() {
    this.authentication.logout();
    this.router.navigateByUrl("/");
  }

  home() {
    this.checkT = this.authentication.isUserLoggedIn();

    if(this.checkT == true) {
      this.router.navigateByUrl("/home");
    }else {
      this.router.navigateByUrl("/");
    }
  }
}

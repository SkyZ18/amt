import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { AuthenticationService } from 'src/app/services/login/authentication.service';

@Component({
  selector: 'app-content-home',
  templateUrl: './content-home.component.html',
  styleUrls: ['./content-home.component.scss']
})
export class ContentHomeComponent {

  checkT: boolean | undefined;

  constructor(
    private authentication: AuthenticationService,
    private router: Router
  ){}

  checkToken(endpoint: string) {
    this.checkT = this.authentication.isUserLoggedIn();

    if(this.checkT == true) {
      this.router.navigateByUrl(`/${endpoint}`);
    }else {
      this.router.navigateByUrl("/");
    }
  }

}

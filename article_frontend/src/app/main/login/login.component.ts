import { Component, OnInit } from '@angular/core';
import { AuthenticationService } from 'src/app/services/login/authentication.service';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  constructor(
    private authentication: AuthenticationService
  ){}

  ngOnInit(): void {
  }

  async submit(email: string, password: string) {
    this.authentication.authenticate(email, password);
  }
}

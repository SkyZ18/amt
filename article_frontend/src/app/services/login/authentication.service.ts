import { Injectable } from '@angular/core';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {

  data: any;

  constructor(
    private router: Router
  ){}

  async authenticate(email: string, password: string) {

    const response = await fetch(`http://localhost:8080/api/v1/auth/login`, {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
        'Accept': 'application/json',
      },
      body: JSON.stringify({
        "email": email,
        "password": password
      })
    });


    this.data = await response.json();

    if(this.data != null) {

      let result = this.generateToken();

      localStorage.setItem("token", result);
      await this.router.navigateByUrl('/home')
    }else {
      console.log("Error while Authenticating");
    }
  }

  generateToken() {
    const characters ='ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!#@<>';

    let result = ' ';
    const charactersLength = characters.length;

    for ( let i = 0; i < 20; i++ ) {
      result += characters.charAt(Math.floor(Math.random() * charactersLength));
    }
    return result
  }

  logout(): void {
    localStorage.removeItem("token");
  }

  isUserLoggedIn(): boolean {
    return localStorage.getItem("token") != null;

  }
}

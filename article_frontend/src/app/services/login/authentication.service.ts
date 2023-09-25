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
    
    const response = await fetch(`http://localhost:8080/api/v1/users/login/${email}&${password}`, {
      method: 'GET',
      headers: {
        'Accept': 'application/json',
      },
    });

    
    this.data = await response.json();

    if(this.data == true) {

      let result = this.generateToken();
      
      localStorage.setItem("token", result);
      this.router.navigateByUrl('/home')
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
    if (localStorage.getItem("token") != null) {
      return true;
    }
    return false;
  }
}

import { Component } from '@angular/core';

@Component({
  selector: 'app-card-get-id',
  templateUrl: './card-get-id.component.html',
  styleUrls: ['./card-get-id.component.scss']
})
export class CardGetIdComponent {

  data: any;

  error = {"name" : "---", "description" : "---", "quantity" : "---"};

  none = {"name" : "---", "description" : "---", "quantity" : "---"};

  async submit(id_s: string) {

    let id: number = +id_s;
    
    const response = await fetch(`http://localhost:8080/api/v1/articles/${id}`, {
      method: 'GET',
      headers: {
        'Accept': 'application/json',
      },
    });

    this.data = await response.json();
    
    if(this.data === null) {
      this.data = this.error
    }

    return this.data;
  }

  clear() {
    this.data = this.none;

    return this.data;
  }
}

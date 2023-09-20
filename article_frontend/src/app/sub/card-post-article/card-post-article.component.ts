import { Component } from '@angular/core';

@Component({
  selector: 'app-card-post-article',
  templateUrl: './card-post-article.component.html',
  styleUrls: ['./card-post-article.component.scss']
})
export class CardPostArticleComponent {

  data: any;
  error = {'status': 'Failed to create new Article'};
  succeed = {'status': 'Success in creating new Article'};


  async submit(name: string, description: string, quantity_s: string) {

    let quantity: Number = +quantity_s;

    if(name && description != "") {

      fetch(`http://localhost:8080/articles/${name}&${description}&${quantity}`, {
        method: 'POST',
        headers: {
          'Accept': 'application/json',
        },
      });
      this.data = this.succeed;

    }else {

      this.data = this.error;
      
    }

    return this.data;
  }
}

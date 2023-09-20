import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HashLocationStrategy, LocationStrategy } from '@angular/common';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './main/home/home.component';
import { LoginComponent } from './main/login/login.component';
import { NavbarComponent } from './sub/navbar/navbar.component';
import { PostArticleComponent } from './main/post-article/post-article.component';
import { GetArticlesComponent } from './main/get-articles/get-articles.component';
import { GetArticleIdComponent } from './main/get-article-id/get-article-id.component';
import { ContentGetIdComponent } from './sub/content-get-id/content-get-id.component';
import { CardGetIdComponent } from './sub/card-get-id/card-get-id.component';
import { ContentPostArticleComponent } from './sub/content-post-article/content-post-article.component';
import { CardPostArticleComponent } from './sub/card-post-article/card-post-article.component';
import { ContentHomeComponent } from './sub/content-home/content-home.component';
import { UpdateArticleIdComponent } from './main/update-article-id/update-article-id.component';
import { DeleteArticleIdComponent } from './main/delete-article-id/delete-article-id.component';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginComponent,
    NavbarComponent,
    PostArticleComponent,
    GetArticlesComponent,
    GetArticleIdComponent,
    ContentGetIdComponent,
    CardGetIdComponent,
    ContentPostArticleComponent,
    CardPostArticleComponent,
    ContentHomeComponent,
    UpdateArticleIdComponent,
    DeleteArticleIdComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [{provide: LocationStrategy, useClass: HashLocationStrategy}],
  bootstrap: [AppComponent]
})
export class AppModule { }

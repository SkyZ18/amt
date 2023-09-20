import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './main/home/home.component';
import { LoginComponent } from './main/login/login.component';
import { PostArticleComponent } from './main/post-article/post-article.component';
import { GetArticlesComponent } from './main/get-articles/get-articles.component';
import { GetArticleIdComponent } from './main/get-article-id/get-article-id.component';
import { UpdateArticleIdComponent } from './main/update-article-id/update-article-id.component';
import { DeleteArticleIdComponent } from './main/delete-article-id/delete-article-id.component';

const routes: Routes = [
  {
    path:'home',
    component: HomeComponent
  },
  {
    path:'',
    component: LoginComponent
  },
  {
    path:'postArticle',
    component: PostArticleComponent
  },
  {
    path:'getAll',
    component: GetArticlesComponent
  },
  {
    path:'getById',
    component: GetArticleIdComponent
  },
  {
    path:'updateArticle',
    component: UpdateArticleIdComponent
  },
  {
    path:'deleteArticle',
    component: DeleteArticleIdComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

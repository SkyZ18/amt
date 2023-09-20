import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CardPostArticleComponent } from './card-post-article.component';

describe('CardPostArticleComponent', () => {
  let component: CardPostArticleComponent;
  let fixture: ComponentFixture<CardPostArticleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CardPostArticleComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CardPostArticleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

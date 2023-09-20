import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateArticleIdComponent } from './update-article-id.component';

describe('UpdateArticleIdComponent', () => {
  let component: UpdateArticleIdComponent;
  let fixture: ComponentFixture<UpdateArticleIdComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UpdateArticleIdComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(UpdateArticleIdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GetArticleIdComponent } from './get-article-id.component';

describe('GetArticleIdComponent', () => {
  let component: GetArticleIdComponent;
  let fixture: ComponentFixture<GetArticleIdComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GetArticleIdComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(GetArticleIdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

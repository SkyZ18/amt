import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeleteArticleIdComponent } from './delete-article-id.component';

describe('DeleteArticleIdComponent', () => {
  let component: DeleteArticleIdComponent;
  let fixture: ComponentFixture<DeleteArticleIdComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DeleteArticleIdComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DeleteArticleIdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

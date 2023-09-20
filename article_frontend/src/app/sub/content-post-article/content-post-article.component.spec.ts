import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ContentPostArticleComponent } from './content-post-article.component';

describe('ContentPostArticleComponent', () => {
  let component: ContentPostArticleComponent;
  let fixture: ComponentFixture<ContentPostArticleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ContentPostArticleComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ContentPostArticleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

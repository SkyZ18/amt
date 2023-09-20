import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ContentGetIdComponent } from './content-get-id.component';

describe('ContentGetIdComponent', () => {
  let component: ContentGetIdComponent;
  let fixture: ComponentFixture<ContentGetIdComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ContentGetIdComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ContentGetIdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

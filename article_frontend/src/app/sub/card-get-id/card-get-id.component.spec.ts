import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CardGetIdComponent } from './card-get-id.component';

describe('CardGetIdComponent', () => {
  let component: CardGetIdComponent;
  let fixture: ComponentFixture<CardGetIdComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CardGetIdComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CardGetIdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

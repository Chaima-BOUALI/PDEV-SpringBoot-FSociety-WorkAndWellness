import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RegistartionComponent } from './registartion.component';

describe('RegistartionComponent', () => {
  let component: RegistartionComponent;
  let fixture: ComponentFixture<RegistartionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RegistartionComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RegistartionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

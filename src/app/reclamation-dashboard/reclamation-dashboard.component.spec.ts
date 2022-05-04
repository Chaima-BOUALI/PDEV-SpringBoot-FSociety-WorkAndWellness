import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ReclamationDashboardComponent } from './reclamation-dashboard.component';

describe('ReclamationDashboardComponent', () => {
  let component: ReclamationDashboardComponent;
  let fixture: ComponentFixture<ReclamationDashboardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ReclamationDashboardComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ReclamationDashboardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

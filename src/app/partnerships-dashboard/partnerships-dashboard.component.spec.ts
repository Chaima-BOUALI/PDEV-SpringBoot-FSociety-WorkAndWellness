import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PartnershipsDashboardComponent } from './partnerships-dashboard.component';

describe('PartnershipsDashboardComponent', () => {
  let component: PartnershipsDashboardComponent;
  let fixture: ComponentFixture<PartnershipsDashboardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PartnershipsDashboardComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PartnershipsDashboardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

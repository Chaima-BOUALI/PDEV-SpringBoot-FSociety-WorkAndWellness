import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MailInboxComponent } from './mail-inbox.component';

describe('MailInboxComponent', () => {
  let component: MailInboxComponent;
  let fixture: ComponentFixture<MailInboxComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MailInboxComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MailInboxComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

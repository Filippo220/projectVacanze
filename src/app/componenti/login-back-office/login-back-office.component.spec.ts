import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LoginBackOfficeComponent } from './login-back-office.component';

describe('LoginBackOfficeComponent', () => {
  let component: LoginBackOfficeComponent;
  let fixture: ComponentFixture<LoginBackOfficeComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [LoginBackOfficeComponent]
    });
    fixture = TestBed.createComponent(LoginBackOfficeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

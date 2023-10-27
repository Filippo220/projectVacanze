import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BackofficeADDComponent } from './backoffice-add.component';

describe('BackofficeADDComponent', () => {
  let component: BackofficeADDComponent;
  let fixture: ComponentFixture<BackofficeADDComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [BackofficeADDComponent]
    });
    fixture = TestBed.createComponent(BackofficeADDComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

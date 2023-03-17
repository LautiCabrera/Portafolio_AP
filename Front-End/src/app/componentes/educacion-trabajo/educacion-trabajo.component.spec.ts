import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EducacionTrabajoComponent } from './educacion-trabajo.component';

describe('EducacionTrabajoComponent', () => {
  let component: EducacionTrabajoComponent;
  let fixture: ComponentFixture<EducacionTrabajoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EducacionTrabajoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EducacionTrabajoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import {async, ComponentFixture, TestBed} from '@angular/core/testing';

import {TaksAddComponent} from './taks-add.component';

describe('TaksAddComponent', () => {
  let component: TaksAddComponent;
  let fixture: ComponentFixture<TaksAddComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TaksAddComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TaksAddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

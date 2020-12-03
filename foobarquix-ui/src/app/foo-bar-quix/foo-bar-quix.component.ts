import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subscription } from 'rxjs';
import { FooBarQuixService } from '../foo-bar-quix.service';

@Component({
  selector: 'app-foo-bar-quix',
  templateUrl: './foo-bar-quix.component.html'
})
export class FooBarQuixComponent implements OnInit, OnDestroy {

  constructor(private fooBarQuixService: FooBarQuixService) { }

  convertedList: NumberConverted[] = [];

  ngOnInit(): void {
  }

  ngOnDestroy(): void {
  }

  convertNumber(inputNumber: number): void {
    this.fooBarQuixService.convertNumber(inputNumber).subscribe(convertedNumber => {
      convertedNumber['numberToConvert'] = inputNumber;
      this.convertedList.unshift(<NumberConverted>convertedNumber);
    }, err => console.log(err));
  }

}

interface NumberConverted {
  numberToConvert: number;
  result: string;
}

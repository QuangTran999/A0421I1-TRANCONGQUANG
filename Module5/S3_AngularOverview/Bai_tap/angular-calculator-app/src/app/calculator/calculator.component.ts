import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {

  S = 0;
  a;
  b;
  constructor() { }

  ngOnInit(): void {
  }

  sum(a, b) {
    this.S = parseFloat(a) + parseFloat(b);
  }
}

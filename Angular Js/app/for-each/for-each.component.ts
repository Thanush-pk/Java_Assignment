import { Component, OnInit } from '@angular/core';
import { hero } from '../hero';
import { products } from '../Products';

@Component({
  selector: 'app-for-each',
  templateUrl: './for-each.component.html',
  styleUrls: ['./for-each.component.css']
})
export class ForEachComponent implements OnInit {

  fruits=['Apple','Mango','orange','Banana','Melon'];
  data=[new hero(121,'Ram'),
        new hero(122,'raj')        
];
product=[new products('Mobile',5000,'assets/images/mobile.jpg'),
          new products('Tablet',80000,'assets/images/Tablet.jpg')];

constructor() { }

  ngOnInit(): void {
  }

}

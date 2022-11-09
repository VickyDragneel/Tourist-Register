import { Component, OnInit } from '@angular/core';
import { RegisterService } from '../register.service';
import { User } from '../Tourist';

@Component({
  selector: 'app-view-tourist',
  templateUrl: './view-tourist.component.html',
  styleUrls: ['./view-tourist.component.css']
})
export class ViewTouristComponent implements OnInit {
  public user:User[]=[];
  public ref:number=0;
  constructor(private registerService: RegisterService) { }

  ngOnInit(): void {
    this.getPassengers();
}
    public getPassengers(): void {
      this.registerService.getPassengers().subscribe(
        (response: User[]) => {
          this.user = response;
          this.ref=this.user.length;
        }
      );
    }
  }



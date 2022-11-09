import { Component, OnInit } from '@angular/core';
import { RegisterService } from '../register.service';
import { User } from '../Tourist';

@Component({
  selector: 'app-tourist-list',
  templateUrl: './tourist-list.component.html',
  styleUrls: ['./tourist-list.component.css']
})
export class TouristListComponent implements OnInit {

  user:User =new User();

  constructor(private registerService: RegisterService) { }

  ngOnInit(): void {
  }
 
  public userRegister(id:string,fname:string,lname:string,source:string,age:string,daysofvisit:string,gender:string){
    this.user.id=parseInt(id);
    this.user.fname=fname;
    this.user.lname=lname;
    this.user.age=parseInt (age);
    this.user.source=source;
    this.user.daysOfVisit=parseInt (daysofvisit);
    this.user.gender=gender;
    console.log(this.user);
    this.registerService.registerUser(this.user).subscribe(data=>{
      alert("Successfully registered Tourist !!!!")
     },error=>alert("Sorry Tourist is not registered"));
   }

}

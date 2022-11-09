import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, Observer } from 'rxjs';
import { User } from './Tourist';

@Injectable({
  providedIn: 'root'
})
export class RegisterService {
   baseUrl="http://localhost:8090";
    
  constructor(private httpClient: HttpClient) { }


  registerUser(user: User): Observable<Object> {
     console.log(user);
     return this.httpClient.post(`/pass/add`,user);
  }
  getPassengers(): Observable<User[]> {
    return this.httpClient.get<User[]>(`/pass/sort`);
  }
}

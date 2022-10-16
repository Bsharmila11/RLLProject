import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Salary } from './salary';

@Injectable({
  providedIn: 'root'
})
export class SalaryService {

   
    baseUrl:string ="http://localhost:9090/salary"
    constructor(public http:HttpClient) { }
  
    storeSalary(salary:any):Observable<string> {
      return this.http.post(this.baseUrl+"/storeSalary",salary,{responseType:"text"});
    }


    findSalaryById(salaryid:number):Observable<string> {
      return this.http.get(this.baseUrl+"/findSalaryById",{responseType:"text"});
}
}

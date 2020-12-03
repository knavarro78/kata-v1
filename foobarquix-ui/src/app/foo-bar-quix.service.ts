import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class FooBarQuixService {
  constructor(private httpClient: HttpClient) { }

  convertNumber(number:Number){
    return this.httpClient.get("http://localhost:8080/foo-bar-quix/" + number);
  }

}

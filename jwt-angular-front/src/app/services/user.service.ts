import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from '../model/user.model';
import { URL_API } from './url.api';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) {}

  login(user: User) {
    console.log(`${URL_API}/api/auth`);
    return this.http.post(`${URL_API}/api/auth`, user);
  }

  getUser() {
    return this.http.get(`${URL_API}/api/token`);
  }

}

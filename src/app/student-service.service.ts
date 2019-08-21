import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Student } from '../app/student'
import { Observable } from 'rxjs';
export class StudentService {

  private studentsUrl : string;

  constructor(private http:HttpClient){
    this.studentsUrl = 'http://localhost:8080/students';
  }

  public findAll(): Observable<Student[]> {
    return this.http.get<Student[]>(this.studentsUrl);
  }
  

}
import { Component, OnInit } from '@angular/core';
import { Student }  from '../student';
import { StudentService } from '../student-service.service';

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {

  student : Student[];

  constructor(private studentService : StudentService) { }

  ngOnInit() {

    this.studentService.findAll().subscribe(data => {
      this.student = data;
    });
  }

}

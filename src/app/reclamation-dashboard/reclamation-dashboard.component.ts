import {Component, Inject, OnInit} from '@angular/core';
import { HttpClient } from "@angular/common/http";
import {MAT_DIALOG_DATA, MatDialog, MatDialogRef} from "@angular/material/dialog";
import {ModifyDialogComponent} from "../modify-dialog/modify-dialog.component";




@Component({
  selector: 'app-reclamation-dashboard',
  templateUrl: './reclamation-dashboard.component.html',
  styleUrls: ['./reclamation-dashboard.component.css']
})
export class ReclamationDashboardComponent implements OnInit {
  constructor(private http:HttpClient,@Inject(MAT_DIALOG_DATA) public data: {name: string},public dialog:MatDialog) { }

public dataList:[Reclamation] ;
  public newObject:string;
  public newStatus:string;
  public newTitle:string;

public openDialog = () => {
  const dialogRef = this.dialog.open(ModifyDialogComponent, {
    width: '640px',
    height:'480px',
    data: {name: this.idR},
  })};
public delete = (data:number)=>{
  this.http.delete(`http://localhost:8000/api/Reclamations/remove-reclamation/${data}`,).subscribe();

};
 public idR: number;
 public dateReclamation:Date;
 public ObjetReclamation:string;


  ngOnInit(): void {


    //  const headers = { 'Authorization': 'Bearer token'};
    //  const body = {  };

      this.http.get<[Reclamation]>('http://127.0.0.4:8000/api/Reclamations/showAll').subscribe(data => {
       this.dataList=data;
      });



  }



}

interface Reclamation{

  idR:number;
dateReclamation:string;
objectReclamation:string;
status:string;
}


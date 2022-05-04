import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {HttpClient} from "@angular/common/http";
import {FormControl} from "@angular/forms";

@Component({

  selector: 'app-modify-dialog',
  templateUrl: './modify-dialog.component.html',
  styleUrls: ['./modify-dialog.component.css']
})
export class ModifyDialogComponent implements OnInit {
public title:string;
public desc:string;
  constructor(public dialogRef: MatDialogRef<ModifyDialogComponent>,
              @Inject(MAT_DIALOG_DATA) public data: Reclamation,public http:HttpClient) { }

  public sendPost= this.http.post("http://localhost:8000/api/Reclamations/modify-reclamations", this.data).subscribe(response => {console.log(response)});
  processKeyupTitle(value: string) {
    this.title+=value;
  }
  processKeyupDesc(value: string) {
    this.desc+=value;
  }
  ngOnInit(): void {
  }


}
export class FavoriteColorComponent {
  favoriteColorControl = new FormControl('');
}
export class KeyUpComponent_v1 {
  values = '';

  onKey(event: any) { // without type info
    this.values += event.target.value + ' | ';
  }
}
interface Reclamation{

  idR:number;
  dateReclamation:string;
  objectReclamation:string;
  status:string;
}


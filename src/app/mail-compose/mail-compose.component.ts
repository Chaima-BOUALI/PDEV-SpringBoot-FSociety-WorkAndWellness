import { Component, OnInit } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-mail-compose',
  templateUrl: './mail-compose.component.html',
  styleUrls: ['./mail-compose.component.css']
})
export class MailComposeComponent implements OnInit {
  public title: string
  public desc:string;
  public status:string;
  processKeyTitle(value:string){
    this.title+=value;
  }
  processKeyDesc(value:string){
    this.desc+=value;
  }
  processKeyStat(value:string){
    this.status+=value;
  }

  constructor(public http:HttpClient) { }
public sendReq = ()=> {
    this.http.post("http://localhost:8000/api/Reclamations/add-reclamations",{
      "titre":this.title,
      "dateReclamation": "4/26/2022 8:29 AM",
      "ObjectReclamation": this.desc,
      "status": this.status
    }).subscribe();
}
  ngOnInit(): void {
  }

}

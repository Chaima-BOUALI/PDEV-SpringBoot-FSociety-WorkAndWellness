import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { ForgotPasswordComponent } from './forgot-password/forgot-password.component';
import { RegistartionComponent} from './registartion/registartion.component';
import { Error404Component } from './error404/error404.component';
import { LanguagesComponent } from './languages/languages.component';
import { TermsComponent } from './terms/terms.component';
import { ChatComponent } from './chat/chat.component';
import { EventCalenderComponent } from './event-calender/event-calender.component';
import { EventComponent } from './event/event.component';
import { NewsFeedComponent } from './news-feed/news-feed.component';
import { MailInboxComponent } from './mail-inbox/mail-inbox.component';
import { MailComposeComponent } from './mail-compose/mail-compose.component';
import { MailReadComponent } from './mail-read/mail-read.component';
import { UserDashboardComponent } from './user-dashboard/user-dashboard.component';
import { EventsDashboardComponent } from './events-dashboard/events-dashboard.component';
import { PartnershipsDashboardComponent } from './partnerships-dashboard/partnerships-dashboard.component';
import { OffersDashboardComponent } from './offers-dashboard/offers-dashboard.component';
import { ReclamationDashboardComponent } from './reclamation-dashboard/reclamation-dashboard.component';
import { QuizDashboardComponent } from './quiz-dashboard/quiz-dashboard.component';
import { ForumComponent } from './forum/forum.component';
import { ArticleComponent } from './article/article.component';
import {HttpClientModule} from "@angular/common/http";
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MAT_DIALOG_DATA, MatDialogModule} from "@angular/material/dialog";
import { ModifyDialogComponent } from './modify-dialog/modify-dialog.component';
import {MatInputModule} from "@angular/material/input";
import {MatButtonModule} from "@angular/material/button";
import {DragDropModule} from "@angular/cdk/drag-drop";
import {ReactiveFormsModule} from "@angular/forms";
import {MatDividerModule} from "@angular/material/divider";
const routes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'about', component: AboutComponent },
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegistartionComponent },
  { path: 'forgotpassword', component: ForgotPasswordComponent },
  { path: 'languages', component: LanguagesComponent },
  { path: 'error404', component: Error404Component },
  { path: 'terms', component: TermsComponent },
  { path: 'eventcalender', component: EventCalenderComponent },
  { path: 'chat', component: ChatComponent },
  { path: 'event', component: EventComponent },
  { path: 'mailinbox', component: MailInboxComponent },
  { path: 'news', component: NewsFeedComponent },
  { path: 'mailcompose', component: MailComposeComponent },
  { path: 'mailread', component: MailReadComponent },
  { path: 'userDash', component: UserDashboardComponent },
  { path: 'eventsdash', component: EventsDashboardComponent },
  { path: 'partnershipsdash', component: PartnershipsDashboardComponent },
  { path: 'offersdash', component: OffersDashboardComponent },
  { path: 'recdash', component: ReclamationDashboardComponent },
  { path: 'quizdash', component: QuizDashboardComponent },
  { path: 'forum', component: ForumComponent },
  { path: 'articles', component: ArticleComponent },




];
@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HomeComponent,
    AboutComponent,
    RegistartionComponent,
    ForgotPasswordComponent,
    Error404Component,
    LanguagesComponent,
    TermsComponent,
    ChatComponent,
    EventCalenderComponent,
    EventComponent,
    NewsFeedComponent,
    MailInboxComponent,
    MailComposeComponent,
    MailReadComponent,
    UserDashboardComponent,
    EventsDashboardComponent,
    PartnershipsDashboardComponent,
    OffersDashboardComponent,
    ReclamationDashboardComponent,
    QuizDashboardComponent,
    ForumComponent,
    ArticleComponent,
    ModifyDialogComponent,
  ],
  imports: [
    BrowserModule,
    MatDialogModule,
    AppRoutingModule,
    RouterModule.forRoot(routes),
    HttpClientModule,
    BrowserAnimationsModule,
    MatInputModule,
    MatButtonModule,
    DragDropModule,
    ReactiveFormsModule,
    MatDividerModule

  ],
  providers: [  { provide: MAT_DIALOG_DATA, useValue: {} },
    { provide: ModifyDialogComponent, useValue: {} }],
  bootstrap: [AppComponent]
})
export class AppModule { }
{ }

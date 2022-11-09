import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';   
import { TouristListComponent } from './tourist-list/tourist-list.component';
import {HttpClientModule} from '@angular/common/http';
import { ViewTouristComponent } from './view-tourist/view-tourist.component'
@NgModule({
  declarations: [
    AppComponent,
    TouristListComponent,
    ViewTouristComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

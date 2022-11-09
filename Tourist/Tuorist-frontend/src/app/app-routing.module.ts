import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { TouristListComponent } from './tourist-list/tourist-list.component';
import { ViewTouristComponent } from './view-tourist/view-tourist.component';

const routes: Routes = [
  {
    path: 'tourist-list',
    component: TouristListComponent
  },
  {
    path:'view-tourist',
    component:ViewTouristComponent

  }
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

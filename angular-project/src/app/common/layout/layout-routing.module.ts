import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LayoutComponent } from './layout.component';
import { DashboardComponent } from 'src/app/page/dashboard/dashboard.component';



const routes: Routes = [
  {
    path: '', component: LayoutComponent,
    children: [

      { path: '', component: DashboardComponent },
      { path: 'home', component: DashboardComponent },
      { path: 'home/:id', component: DashboardComponent },
    ]
  },
];




@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class LayoutRoutingModule { }

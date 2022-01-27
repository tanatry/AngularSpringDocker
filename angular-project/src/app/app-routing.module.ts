import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './page/login/login.component';
import { AuthLoginGuard } from './_guards/auth-login.guard';
import { AuthGuard } from './_guards/auth.guard';

const routes: Routes = [
  {
    path: '', redirectTo: '/login', pathMatch: 'full'
  },
  {
    path: 'login', component: LoginComponent, canActivate: [AuthLoginGuard]
  },
  { path: '', loadChildren: () => import('../app/common/layout/layout.module'), canActivate: [AuthGuard] },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

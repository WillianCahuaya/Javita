import { Routes } from '@angular/router';
import { UserComponent } from './components/user/user.component';
import { ProductComponent } from './components/product/product.component';
import { LoginComponent } from './components/login/login.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { WelcomeComponent } from './components/welcome/welcome.component';

export const BUSINESS_ROUTES: Routes = [
  {
    path: '',
    component: DashboardComponent,
    children: [
      {
        path: '',
        component: WelcomeComponent,
      },
      {
        path: 'user',
        component: UserComponent,
      },
      {
        path: 'product',
        component: ProductComponent,
      },
      {
        path: 'brand',
        component: UserComponent,
      },
      {
        path: 'login',
        component: LoginComponent,
      },
      {
        path: 'category',
        component: LoginComponent,
      },
    ],
  },
];

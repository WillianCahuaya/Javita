import { Routes } from '@angular/router';
import { UserComponent } from './user/user.component';
import { ProductComponent } from './product/product.component';
import { LoginComponent } from './login/login.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { WelcomeComponent } from './welcome/welcome.component';

export const PAGE_ROUTES: Routes = [
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

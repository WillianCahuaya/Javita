import { Routes } from '@angular/router';
import {LoginComponent} from '../business/components/login/login.component';

export const AUTH_ROUTES: Routes = [
    {
        path: '', component: LoginComponent
    }
];

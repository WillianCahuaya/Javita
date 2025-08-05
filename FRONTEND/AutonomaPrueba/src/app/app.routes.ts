import { Routes } from '@angular/router';

export const routes: Routes = [
    
    {
        path: '', redirectTo: 'dashboard', pathMatch: 'full',
    },
    {
        path: 'login',
        loadChildren: () => import('./auth/auth.routes').then(m => m.AUTH_ROUTES)
    },
    {
        path: 'dashboard',
        loadChildren: () => import('./pages/page-routes').then(m => m.PAGE_ROUTES)
    }
];

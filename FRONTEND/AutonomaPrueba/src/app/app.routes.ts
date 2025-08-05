import { Routes } from '@angular/router';

export const routes: Routes = [
    {
        path: '', redirectTo: 'dashboard', pathMatch: 'full',
    },
    {
        path: 'dashboard',
        loadChildren: () => import('./pages/page-routes').then(m => m.PAGE_ROUTES)
    }
];

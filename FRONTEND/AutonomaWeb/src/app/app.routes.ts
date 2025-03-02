import { Routes } from '@angular/router';

export const routes: Routes = [
    {
        path: '',
        loadChildren: () => import('./business/business.routes').then(m => m.BUSINESS_ROUTES)
    }
];

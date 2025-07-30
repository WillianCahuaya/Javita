import { Routes } from '@angular/router';
import { UserComponent } from './user/user.component';
import { ProductComponent } from './product/product.component';

export const PAGE_ROUTES: Routes = [
    {
        path: 'user', component: UserComponent,
    },
    {
        path: 'product', component: ProductComponent,
    },
    {
        path: 'brand', component: UserComponent,
    }
];
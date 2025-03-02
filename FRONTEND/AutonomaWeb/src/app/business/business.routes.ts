import { Routes } from '@angular/router';
import { BusinessComponent } from './business.component';
import { WelcomeComponent } from './components/welcome/welcome.component';
import { TemplateComponent } from './components/template/template.component';
import { UserComponent } from './components/user/user.component';
import { LoginComponent } from './components/login/login.component';

export const BUSINESS_ROUTES: Routes = [
    {
        path: '', component: LoginComponent
    },
    {
        path: '', component: BusinessComponent,
        children: [
            {
                path: 'home', component: WelcomeComponent
            },
            {
                path: 'template', component: TemplateComponent
            },
            {
                path: 'user', component: UserComponent
            }
        ]
    }
];
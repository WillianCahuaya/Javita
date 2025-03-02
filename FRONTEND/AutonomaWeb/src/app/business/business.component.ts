import { Component, ChangeDetectorRef } from '@angular/core';
import { Router, RouterOutlet } from '@angular/router';
import { RouterLink, RouterLinkActive, RouterModule } from '@angular/router';
import { CommonModule } from '@angular/common';

@Component({
    selector: 'app-business',
    standalone: true,
    imports: [
        RouterOutlet,
        CommonModule,
        RouterLink,
        RouterModule,
        RouterLinkActive
    ],
    templateUrl: './business.component.html',
    styleUrl: './business.component.sass'
})
export class BusinessComponent {

    showNavBar: boolean = false;
    username: string | undefined = '';

    constructor(
        private cdRef: ChangeDetectorRef,
        private readonly router: Router
    ) {
    }

    ngAfterContentChecked(): void {
        this.cdRef.detectChanges();
    }

    public changeNavBar() {
        this.showNavBar = !this.showNavBar;
    }

    public signOut() {
        this.router.navigate(['']);
    }

}

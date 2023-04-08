import { Component } from '@angular/core';

import { JwtResponse, UserRegistrationDto } from '@app/_models';
import { AccountService } from '@app/_services';

@Component({ templateUrl: 'home.component.html' })
export class HomeComponent {
    user: JwtResponse | null;

    constructor(private accountService: AccountService) {
        this.user = this.accountService.userValue;
    }
}
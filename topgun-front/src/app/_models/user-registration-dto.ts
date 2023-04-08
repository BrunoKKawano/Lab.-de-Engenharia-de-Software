import { Address } from "./address";

export class UserRegistrationDto {
    login?: string;
    password?: string;
    name?: string;
    birthDate?: Date;
    address?: Address;
}
import { Address } from "./address";

export class User {
    id?: string;
    login?: string;
    password?: string;
    name?: string;
    birthDate?: string;
    address?: Address;
    token?: string;
}
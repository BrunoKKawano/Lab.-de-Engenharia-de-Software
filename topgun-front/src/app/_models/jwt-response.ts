import { Address } from "./address";

export class JwtResponse {
    id?: number
    login?: string;
    token?: string;
    roles?: string[];
}
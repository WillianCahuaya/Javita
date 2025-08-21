import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

export interface User {
    id: number;
    name: string;
}

@Injectable({ providedIn: 'root' })
export class ApiService {

    private baseUrl = 'http://localhost:8080';

    constructor(private http: HttpClient) { }

    getUsers(): Observable<User[]> {
        return this.http.get<User[]>(`${this.baseUrl}/users`);
    }

    getUser(id: number): Observable<User> {
        return this.http.get<User>(`${this.baseUrl}/users/${id}`);
    }

    createUser(user: Partial<User>): Observable<User> {
        return this.http.post<User>(`${this.baseUrl}/users`, user);
    }

    updateUser(id: number, user: Partial<User>): Observable<User> {
        return this.http.put<User>(`${this.baseUrl}/users/${id}`, user);
    }

    deleteUser(id: number): Observable<void> {
        return this.http.delete<void>(`${this.baseUrl}/users/${id}`);
    }
}
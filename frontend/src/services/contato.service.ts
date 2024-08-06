import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";

import { API_CONFIG } from "../config/api.config";
import { ContatoDTO } from "../models/contato.dto";
import { Observable } from "rxjs";

@Injectable()
export class ContatoService{

    constructor(public http : HttpClient){
    }

    findAll(): Observable<ContatoDTO[]> {
        return this.http.get<ContatoDTO[]>(`${API_CONFIG.baseUrl}/contatos`);
    }
}
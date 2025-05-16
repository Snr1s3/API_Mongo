package com.iticbcn.mongoapi.api_mongo.Service;

import com.iticbcn.mongoapi.api_mongo.DTO.UsuarisDTO;
import com.iticbcn.mongoapi.api_mongo.Models.Usuaris;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UsuariService {
    Mono<Usuaris> save(Usuaris usuari);
    Mono<Usuaris> findById(String id);
    Flux<Usuaris> findAll();
    Mono<Usuaris> update(UsuarisDTO usuariDTO);
    Mono<Void> delete(String id);
}
package com.iticbcn.mongoapi.api_mongo.Service;

import com.iticbcn.mongoapi.api_mongo.DTO.UsuarisDTO;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UsuariService {
    Mono<UsuarisDTO> save(UsuarisDTO usuariDTO);
    Mono<UsuarisDTO> findById(String id);
    Flux<UsuarisDTO> findAll();
    Mono<UsuarisDTO> update(UsuarisDTO usuariDTO);
    Mono<Void> delete(String id);
}
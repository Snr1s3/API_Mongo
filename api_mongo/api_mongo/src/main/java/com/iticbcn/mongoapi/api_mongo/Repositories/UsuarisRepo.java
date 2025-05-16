package com.iticbcn.mongoapi.api_mongo.Repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.iticbcn.mongoapi.api_mongo.Models.Usuaris;

import reactor.core.publisher.Flux;

@Repository
public interface UsuarisRepo extends ReactiveMongoRepository<Usuaris, String> {
    Flux<Usuaris> findByNomRegex(String regex);
}
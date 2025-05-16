package com.iticbcn.mongoapi.api_mongo.Repositories;

import com.iticbcn.mongoapi.api_mongo.Models.Usuaris;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarisRepo extends ReactiveMongoRepository<Usuaris, String> {
}
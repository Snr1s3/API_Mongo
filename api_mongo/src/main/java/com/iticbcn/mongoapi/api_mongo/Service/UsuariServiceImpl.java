package com.iticbcn.mongoapi.api_mongo.Service;

import com.iticbcn.mongoapi.api_mongo.Models.Usuaris;
import com.iticbcn.mongoapi.api_mongo.DTO.UsuarisDTO;
import com.iticbcn.mongoapi.api_mongo.Repositories.UsuarisRepo;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UsuariServiceImpl implements UsuariService {

    private final UsuarisRepo usuarisRepo;

    public UsuariServiceImpl(UsuarisRepo usuarisRepo) {
        this.usuarisRepo = usuarisRepo;
    }

    @Override
    public Mono<Usuaris> save(Usuaris usuari) {
        return usuarisRepo.save(usuari);
    }

    @Override
    public Mono<Usuaris> findById(String id) {
        return usuarisRepo.findById(id);
    }

    @Override
    public Flux<Usuaris> findAll() {
        return usuarisRepo.findAll();
    }

    @Override
    public Mono<Usuaris> update(UsuarisDTO usuariDTO) {
        return usuarisRepo.findById(usuariDTO.id())
            .map(existing -> new Usuaris(usuariDTO.id(), usuariDTO.nom(), usuariDTO.edat()))
            .flatMap(usuarisRepo::save);
    }

    @Override
    public Mono<Void> delete(String id) {
        return usuarisRepo.deleteById(id);
    }
}
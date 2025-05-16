package com.iticbcn.mongoapi.api_mongo.Service;

import org.springframework.stereotype.Service;

import com.iticbcn.mongoapi.api_mongo.DTO.UsuarisDTO;
import com.iticbcn.mongoapi.api_mongo.Mapper.UsuarisMapper;
import com.iticbcn.mongoapi.api_mongo.Models.Usuaris;
import com.iticbcn.mongoapi.api_mongo.Repositories.UsuarisRepo;
import org.bson.types.ObjectId;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UsuariServiceImpl implements UsuariService {

    private final UsuarisRepo usuarisRepo;
    private final UsuarisMapper usuarisMapper;


    public UsuariServiceImpl(UsuarisRepo usuarisRepo,  UsuarisMapper usuarisMapper) {
        this.usuarisRepo = usuarisRepo;
        this.usuarisMapper = usuarisMapper;
    }

    @Override
    public Mono<UsuarisDTO> save(UsuarisDTO usuariDTO) {
        Usuaris usuari = usuarisMapper.toEntity(usuariDTO);

        if(usuari.getId() == null) {
            usuari.setId(new ObjectId().toString());
        }
        return usuarisRepo.save(usuari)
                .map(usuarisMapper::toDto);
    }

    @Override
    public Mono<UsuarisDTO> findById(String id) {
        return usuarisRepo.findById(id).map(usuarisMapper::toDto);
    }

    @Override
    public Flux<UsuarisDTO> findAll() {
        return usuarisRepo.findAll().map(usuarisMapper::toDto);
    }

    @Override
    public Mono<UsuarisDTO> update(UsuarisDTO usuariDTO) {
        return usuarisRepo.findById(usuariDTO.id())
                .flatMap(existing -> {
                    Usuaris updated = usuarisMapper.toEntity(usuariDTO);
                    return usuarisRepo.save(updated);
                }).map(usuarisMapper::toDto);
    }

    @Override
    public Mono<Void> delete(String id) {
        return usuarisRepo.deleteById(id);
    }
}
package com.iticbcn.mongoapi.api_mongo.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iticbcn.mongoapi.api_mongo.DTO.UsuarisDTO;
import com.iticbcn.mongoapi.api_mongo.Models.Usuaris;
import com.iticbcn.mongoapi.api_mongo.Service.UsuariService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/usuaris")
public class RESTController {

    @Autowired
    private UsuariService usuarisService;

    @PostMapping("/save")
    public Mono<Usuaris> save(@RequestBody Usuaris usuari) {
        return usuarisService.save(usuari);
    }

    @GetMapping("/{id}")
    public Mono<Usuaris> findById(@PathVariable String id) {
        return usuarisService.findById(id);
    }

    @GetMapping("/all")
    public Flux<Usuaris> findAll() {
        return usuarisService.findAll();
    }

    @PutMapping("/update")
    public Mono<Usuaris> update(@RequestBody UsuarisDTO usuari) {
        return usuarisService.update(usuari);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id) {
        return usuarisService.delete(id);
    } 
}
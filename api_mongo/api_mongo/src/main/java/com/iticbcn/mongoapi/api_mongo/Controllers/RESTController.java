package com.iticbcn.mongoapi.api_mongo.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iticbcn.mongoapi.api_mongo.DTO.UsuarisDTO;
import com.iticbcn.mongoapi.api_mongo.Service.UsuariService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/usuaris")
public class RESTController {

    @Autowired
    private final UsuariService usuarisService;

    public RESTController(UsuariService usuarisService) {
        this.usuarisService = usuarisService;
    }

    @PostMapping("/save")
    public Mono<ResponseEntity<UsuarisDTO>> save(@RequestBody UsuarisDTO usuariDTO) {
         return usuarisService.save(usuariDTO)
                .map(saved -> ResponseEntity.ok(saved))
                .onErrorResume(e -> {
                    e.printStackTrace();
                    return Mono.just(ResponseEntity.internalServerError().build());
                });
    }

    @GetMapping("/{id}")
    public Mono<ResponseEntity<UsuarisDTO>> findById(@PathVariable String id) {
        return usuarisService.findById(id)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @GetMapping("/all")
    public Flux<UsuarisDTO> findAll() {
        return usuarisService.findAll()
                .onErrorResume(e -> {
                    return Flux.empty();
                });
    }

    @PutMapping("/update")
    public Mono<ResponseEntity<UsuarisDTO>> update(@RequestBody UsuarisDTO usuariDTO) {
        return usuarisService.update(usuariDTO)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id) {
        return usuarisService.delete(id);
    }  

    @GetMapping("/search/{regex}")
    public Flux<UsuarisDTO> searchByNomRegex(@PathVariable String regex) {
        return usuarisService.findByNomRegex(regex)
                .onErrorResume(e -> {
                    e.printStackTrace();
                    return Flux.empty();
                });
    }
}
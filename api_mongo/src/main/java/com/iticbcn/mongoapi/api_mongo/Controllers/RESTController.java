package com.iticbcn.mongoapi.api_mongo.Controller;
import com.iticbcn.mongoapi.api_mongo.Models.Usuaris;
import com.iticbcn.mongoapi.api_mongo.Service.UsuariService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;
import com.iticbcn.mongoapi.api_mongo.DTO.UsuarisDTO;
import java.util.List;

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
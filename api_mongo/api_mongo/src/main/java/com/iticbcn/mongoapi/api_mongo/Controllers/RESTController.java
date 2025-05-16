package com.iticbcn.mongoapi.api_mongo.Controller;
import com.iticbcn.mongoapi.api_mongo.Models.Usuaris;
import com.iticbcn.mongoapi.api_mongo.Service.UsuariService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/usuaris")
public class RESTController {

    @Autowired
    private UsuariService usuarisService;

    @PostMapping("/save")
    public Usuaris save(@RequestBody Usuaris usuari) {
        return usuarisService.save(usuari);
    }

    @GetMapping("/{id}")
    public Usuaris findById(@PathVariable String id) {
        return usuarisService.findById(id);
    }

    @GetMapping("/all")
    public List<Usuaris> findAll() {
        return usuarisService.findAll();
    }

    @PutMapping("/update")
    public Usuaris update(@RequestBody UsuarisDTO usuari) {
        return usuarisService.update(usuari);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id) {
        return usuarisService.delete(id);
    } 
}
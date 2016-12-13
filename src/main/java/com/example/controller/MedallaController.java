package com.example.controller;

import com.example.domain.Atleta;
import com.example.domain.TipoMedalla;
import com.example.domain.Medalla;
import com.example.repository.AtletaRepository;
import com.example.repository.MedallaRepository;
import com.sun.tools.javac.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Properties;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

/**
 * Created by DAM on 7/12/16.
 */
@RestController
@RequestMapping("/medallas")
public class MedallaController {

    @Autowired
    private MedallaRepository medallaRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Medalla createMedal(@RequestBody Medalla medalla){
        return medallaRepository.save(medalla);
    }

    @GetMapping
    public List<Medalla> getAllMedals(){
        return (List<Medalla>) medallaRepository.findAll();
    }


    @PutMapping
    public Medalla updateMedal(@RequestBody Medalla medal){
        return medallaRepository.save(medal);
    }

    @DeleteMapping("/{id}")
    public void deleteMedalID(@PathVariable Long id){
        Medalla medalla = medallaRepository.findOne(id);
        if(medalla != null ) medallaRepository.delete(id);
    }
}
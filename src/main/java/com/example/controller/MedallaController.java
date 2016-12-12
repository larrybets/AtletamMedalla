package com.example.controller;

import com.example.domain.Enumeracion;
import com.example.domain.Medalla;
import com.example.repository.MedallaRepository;
import com.sun.tools.javac.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by DAM on 7/12/16.
 */
@RestController
@RequestMapping("/medallas")
public class MedallaController {

    @Autowired
    private MedallaRepository medallaRepository;

    @GetMapping
    public List<Medalla> getMedallas(){
        return (List<Medalla>) medallaRepository.findAll();
    }
    @GetMapping("/groupby/tipo")
    public Map<Enumeracion, List<Medalla>> getMedallasGroupByTipo(){
        return medallaRepository
                .findAll()
                .parallelStream()
                .collect(Collectors.groupingBy(Medalla::getEnumeracion));
    }

}

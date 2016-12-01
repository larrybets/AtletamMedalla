package com.example.service;

import com.example.domain.Atleta;
import com.example.repository.AtletaRepository;
import com.example.repository.MedallaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

/**
 * Created by DAM on 1/12/16.
 */
public class AtletaService {

    @Autowired
    private AtletaRepository atletaRepository;

    @Autowired
    private MedallaRepository medallaRepository;

    public void testAtletas(){

        Atleta atleta1 = new Atleta ("Larry","Sanchez","Peru",LocalDate.of(1990 ,02, 27));
        Atleta atleta2 = new Atleta ("Larry","Sanchez","Peru",LocalDate.of(1990 ,02, 27));
        Atleta atleta3 = new Atleta ("Larry","Sanchez","Peru",LocalDate.of(1990 ,02, 27));
        Atleta atleta4 = new Atleta ("Larry","Sanchez","Peru",LocalDate.of(1990 ,02, 27));

    }

}

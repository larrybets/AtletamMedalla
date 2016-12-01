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
        atletaRepository.save(atleta1);
        Atleta atleta2 = new Atleta ("Sergio","Diaz","Jamaica",LocalDate.of(1996 ,02, 9));
        atletaRepository.save(atleta2);

        Atleta atleta3 = new Atleta ("Nando","Aranda","Valenciana",LocalDate.of(1994 ,07, 21));
        atletaRepository.save(atleta3);

        Atleta atleta4 = new Atleta ("Victor","Amador","Mongol",LocalDate.of(1992 ,07, 27));
        atletaRepository.save(atleta4);

        Atleta atleta5 = new Atleta ("Kim","Marica","Barricadas",LocalDate.of(1992 ,06, 02));
        atletaRepository.save(atleta5);


    }

}

package com.example.service;

import com.example.domain.Atleta;
import com.example.domain.Enumeracion;
import com.example.domain.Medalla;
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

        ///////////////////////////////////////////

        Medalla primera = new Medalla(Enumeracion.valueOf("ORO"),"Tiro con arco","", atleta1);
        medallaRepository.save(primera);
        Medalla segunda = new Medalla(Enumeracion.valueOf("PLATA"),"Tiro con arco","", atleta2);
        medallaRepository.save(segunda);

        Medalla tercera = new Medalla(Enumeracion.valueOf("BRONCE"),"Tiro con arco","", atleta3);
        medallaRepository.save(tercera);

        Medalla cuarta = new Medalla(Enumeracion.valueOf("BRONCE"),"Tiro con arco","", atleta4);
        medallaRepository.save(cuarta);

        Medalla quinta = new Medalla(Enumeracion.valueOf("ORO"),"Tiro con arco","", atleta5);
        medallaRepository.save(quinta);

        Medalla sexta = new Medalla(Enumeracion.valueOf("PLATA"),"Tiro con arco","", atleta2);
        medallaRepository.save(sexta);

    }

}

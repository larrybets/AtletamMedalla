package com.example.repository;

import com.example.domain.Medalla;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by DAM on 1/12/16.
 */
public interface MedallaRepository extends JpaRepository <Medalla,Long>{
    List<Medalla> findByCompeticion (String nombre);
}

package com.portfolio.lau.Repository;

import com.portfolio.lau.Entity.Habilidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iHabilidadesRepository extends JpaRepository<Habilidades, Integer> {
    
    
    
}

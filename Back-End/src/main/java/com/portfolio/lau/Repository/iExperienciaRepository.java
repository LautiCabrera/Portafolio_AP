package com.portfolio.lau.Repository;

import com.portfolio.lau.Entity.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iExperienciaRepository extends JpaRepository<Experiencia, Integer> {
}

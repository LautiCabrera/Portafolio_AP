package com.portfolio.lau.Repository;

import com.portfolio.lau.Entity.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iEducacionRepository extends JpaRepository<Educacion, Integer>{
}
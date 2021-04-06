package com.projras.devras.repositories;

import java.time.Instant;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.projras.devras.entities.Cadastro;

@Repository
public interface CadastroRepository extends JpaRepository<Cadastro, Long>{

	
	@Query("SELECT obj FROM Cadastro obj")
	Page<Cadastro> findByMoments(Instant min, Instant max, PageRequest pageRequest);

}

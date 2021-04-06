package com.projras.devras.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projras.devras.entities.Cidade;

/*
  implementa camada de acesso adados CRUD
*/
@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Long>{

}

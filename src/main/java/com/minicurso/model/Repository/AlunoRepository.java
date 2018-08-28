package com.minicurso.model.Repository;

import com.minicurso.model.entity.AlunoEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<AlunoEntity, Long>{

}
package com.minicurso.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "aluno")
public class AlunoEntity implements Serializable{

    private static final long serialVersionUID = 1L;

    private Long id;
    private String nome;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

    @Column(name = "nome", length = 100, nullable = false)
    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
    }
}
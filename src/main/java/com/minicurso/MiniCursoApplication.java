package com.minicurso;

import com.minicurso.model.Repository.AlunoRepository;
import com.minicurso.model.entity.AlunoEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MiniCursoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiniCursoApplication.class, args);
	}


	@Autowired
	private AlunoRepository alunoRepository;

	@GetMapping(value = "/mainAPI")
	public String MainAPI(){

		AlunoEntity alunoEntity = new AlunoEntity();
		alunoEntity.setNome("Aluno nome");
		alunoRepository.save(alunoEntity);
		return "API On";
	}
}




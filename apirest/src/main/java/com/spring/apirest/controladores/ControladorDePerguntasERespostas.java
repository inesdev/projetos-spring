package com.spring.apirest.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.apirest.servicos.ServicoDePerguntasERespostas;

@RestController
public class ControladorDePerguntasERespostas {
	
	@Autowired
	private ServicoDePerguntasERespostas servicoDePerguntasERespostas;
	
	@PostMapping("/perguntas")
	public ResponseEntity<Pergunta> adicionaPergunta(@RequestBody PerguntaDTO pergunta) {
		return new ResponseEntity<Pergunta>(servicoDePerguntasERespostas.adicionaPergunta(pergunta),
										HttpStatus.CREATED);
	}
	

}

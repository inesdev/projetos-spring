package com.spring.apirest.servicos;

import org.springframework.stereotype.Service;

import com.spring.apirest.dtos.PerguntaDTO;
import com.spring.apirest.entidades.Pergunta;
import com.spring.apirest.repositorios.RepositorioDePerguntas;


@Service
public class ServicoDePerguntasERespostas {
	private RepositorioDePerguntas repositorioDePerguntas = new RepositorioDePerguntas();
	
	public Pergunta adicionaPergunta(PerguntaDTO perguntaDto) {
		return repositorioDePerguntas.adicionaPergunta(perguntaDto.getTexto(),
								perguntaDto.getPalavrasChave());
		
	}

}

package com.spring.apirest.respositorios;

import java.util.ArrayList;
import java.util.List;

import com.spring.apirest.dtos.PerguntaDTO;
import com.spring.apirest.entidades.Pergunta;

public class RepostitorioDePerguntas {
	
	private List<Pergunta> perguntas;
	private int proximoId = 0;

	public RepostitorioDePerguntas(List<Pergunta> perguntas) {
		super();
		
		perguntas = new ArrayList<Pergunta>();
	}
	
	public Pergunta adicionaPergunta(String texto, String palavrasChave) {
		Pergunta pergunta = new Pergunta(proximoId++, texto, 
											palavrasChave);
		
		perguntas.add(pergunta);
		return pergunta;
	}
}

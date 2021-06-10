package com.spring.apirest.dtos;

public class PerguntaDTO {
	private String texto;
	private String palavrasChave;
	public PerguntaDTO(String texto, String palavrasChave) {
		super();
		this.texto = texto;
		this.palavrasChave = palavrasChave;
	}
	public PerguntaDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public String getPalavrasChave() {
		return palavrasChave;
	}
	public void setPalavrasChave(String palavrasChave) {
		this.palavrasChave = palavrasChave;
	}
	
	
}

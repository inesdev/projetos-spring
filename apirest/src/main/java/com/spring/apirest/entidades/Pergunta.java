package com.spring.apirest.entidades;

public class Pergunta {
	private int id;
	private String texto;
	private String palavrasChave;
	private boolean apagada = false;
	
	public Pergunta() {
		super();
	}
	
	public Pergunta(int id, String texto, String palavrasChave) {
		super();
		this.id = id;
		this.texto = texto;
		this.palavrasChave = palavrasChave;
		
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

	public boolean getApagada() {
		return apagada;
	}

	public void setApagada(boolean apagada) {
		this.apagada = apagada;
	}

	public int getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (apagada ? 1231 : 1237);
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pergunta other = (Pergunta) obj;
		if (apagada != other.apagada)
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	
	
	
}

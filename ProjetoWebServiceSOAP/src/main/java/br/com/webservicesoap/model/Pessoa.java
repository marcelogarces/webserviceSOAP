package br.com.webservicesoap.model;

import java.util.Calendar;
import java.util.List;

public class Pessoa {

	private String nome;
	private Calendar dataNascimento;	
	private List<Bem> bens;

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public List<Bem> getBens() {
		return bens;
	}

	public void setBens(List<Bem> bens) {
		this.bens = bens;
	}	
}

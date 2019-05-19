package br.com.webservicesoap.model;

public enum TipoBem {

	IMOVEL("Im�vel"),
	AUTOMOVEL("Automovel"),
	JOIA("J�ia");
	
	private String nome;
	
	TipoBem(String nome) {
		this.setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public static boolean existe(String valor) {
		
		try{			
			TipoBem.valueOf(valor.toUpperCase());			
		}catch (IllegalArgumentException e) {
		return false;
		}
		return true;
	}
}

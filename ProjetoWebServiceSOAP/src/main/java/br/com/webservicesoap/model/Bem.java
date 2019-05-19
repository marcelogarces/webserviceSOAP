package br.com.webservicesoap.model;

import java.math.BigDecimal;
import java.util.Calendar;

public class Bem {
	
	private Long codigo;
	
	private String descricao;

	private BigDecimal valor;
	
	private Calendar dataAquisicao;
	
	private TipoBem tipo;
	
	public Bem() {
		super();
	}
	
	public Bem(Long codigo,String descricao, BigDecimal valor, Calendar dataAquisicao, TipoBem tipo) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
		this.dataAquisicao = dataAquisicao;
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Calendar getDataAquisicao() {
		return dataAquisicao;
	}

	public void setDataAquisicao(Calendar dataAquisicao) {
		this.dataAquisicao = dataAquisicao;
	}
	
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}


	public TipoBem getTipo() {
		return tipo;
	}

	public void setTipo(TipoBem tipo) {
		this.tipo = tipo;
	}



	public static class Builder {
	
		private Long codigo;
		private String descricao;
		private BigDecimal valor;	
		private Calendar dataAquisicao;
		private TipoBem tipo;
		
		public Builder comDescricao(String descricao) {
			this.descricao = descricao;
			return this;
		}

		public Builder comValor(BigDecimal valor) {
			this.valor = valor;
			return this;
		}

		public Builder comDataAquisicao(Calendar dataAquisicao) {
			this.dataAquisicao = dataAquisicao;
			return this;
		}
		
		public Builder comTipo(TipoBem tipoBem) {
			this.tipo = tipoBem;
			return this;
		}
		
		public Builder comCodigo(Long codigo) {
			this.codigo = codigo;
			return this;
		}
		
		public Bem build() {
			return new Bem(this.codigo,this.descricao, this.valor, this.dataAquisicao,this.tipo);
		}		
	}	
}

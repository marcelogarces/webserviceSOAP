package br.com.webservicesoap.model;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.Map;


public class BemDAO {
	
	private static Map<Long, Bem> BENS = new LinkedHashMap<>();

	
	public BemDAO() {
		
		popularItensNoMapa();		
	}
	
	public void incluir(Bem bem) {
		
		BENS.put(bem.getCodigo(), bem);
	}
	
	private void popularItensNoMapa() {
		
		BENS.put(1l, new Bem.Builder().comCodigo(1l)
			    .comDescricao("Apartamento padrão")
				.comValor(new BigDecimal(190.000))
				.comDataAquisicao(new GregorianCalendar(2012, Calendar.JULY, 19))
				.comTipo(TipoBem.IMOVEL)
				.build());
		
	
	}
}

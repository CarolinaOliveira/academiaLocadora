package br.util;

public class GeraTabela {

	public static void main(String[] args) {
		
		HibernateUtil.getFabricaDeSessoes();
		HibernateUtil.getFabricaDeSessoes().close();

	}

}

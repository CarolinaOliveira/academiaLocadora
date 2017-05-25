package br.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.dao.AtendenteDAO;
import br.entity.Atendente;

@ManagedBean
public class ClienteMB {

	public List<Atendente> getListaAtendente() {
		return listaAtendente;
	}

	public void setListaAtendente(List<Atendente> listaAtendente) {
		this.listaAtendente = listaAtendente;
	}

	private Atendente atendente = new Atendente();
	private List<Atendente> listaAtendente = new ArrayList();

	public void salvar() {

		AtendenteDAO atendenteDAO = new AtendenteDAO();
		atendenteDAO.salvar(atendente);

	}

	public String listar() {

		AtendenteDAO atendenteDAO = new AtendenteDAO();
		listaAtendente = atendenteDAO.listar();
		return "atendenteListar.xhtml";

	}
	public String telaIncluirAtendente() {
		return "atendenteIncluir.xhtml";
	}
	

	public Atendente getAtendente() {
		return atendente;
	}

	public void setAtendente(Atendente atendente) {
		this.atendente = atendente;
	}

}

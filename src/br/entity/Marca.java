package br.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Marca")
@NamedQueries({ 
	    @NamedQuery(name = "Marca.listar", query = "SELECT marca FROM Marca marca"),
		@NamedQuery(name = "Marca.buscarPorId", query = "SELECT marca FROM Marca marca WHERE marca.id = :id") 
	    })

public class Marca {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idMarca")
	private Long id;

	@Column(name = "nomeMarca", length = 20, nullable = false)
	private String nome;

	@Column(name = "tipo", length = 20, nullable = false)
	private String tipo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Marca id =" + id + ", nome =" + nome + ", tipo =" + tipo + "";
	}

}

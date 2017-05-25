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
@Table(name = "Atendente")
@NamedQueries({ 
    @NamedQuery(name = "Atendente.listar", query = "SELECT atendente FROM Atendente atendente"),
	@NamedQuery(name = "Atendente.buscarPorId", query = "SELECT atendente FROM Atendente atendente WHERE atendente.id = :id") 
    })
public class Atendente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idAtend")
	private Long idAt;

	@Column(name = "nomeAtend", length = 20, nullable = false)
	private String nomeAt;

	@Column(name = "senha", length = 8, nullable = false)
	private int senha;

	@Column(name = "CPFAtend", length = 11, nullable = false, unique = true)
	private String cpfAt;

	public Long getIdAt() {
		return idAt;
	}

	public void setIdAt(Long idAt) {
		this.idAt = idAt;
	}

	public String getNomeAt() {
		return nomeAt;
	}

	public void setNomeAt(String nomeAt) {
		this.nomeAt = nomeAt;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public String getCpfAt() {
		return cpfAt;
	}

	public void setCpfAt(String cpfAt) {
		this.cpfAt = cpfAt;
	}

	@Override
	public String toString() {
		return "Atendente [idAt= " + idAt + ", nomeAt= " + nomeAt + ", senha= " + senha + ", cpfAt= " + cpfAt + "]";
	}

	
}



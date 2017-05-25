package br.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Locatario")
@NamedQueries({ 
    @NamedQuery(name = "Locatario.listar", query = "SELECT locatario FROM Locatario locatario"),
	@NamedQuery(name = "Locatario.buscarPorCPF", query = "SELECT locatario FROM Locatario locatario WHERE locatario.cpfLoc = :cpfLoc") 
    })
public class Locatario {
	@Id
	@Column(name = "cpfLoc", length = 11, unique = true)
	private String cpfLoc;

	@Column(name = "nomeLoc", length = 50, nullable = false)
	private String nomeLoc;

	@Column(name = "emailLoc", length = 50, unique = true)
	private String emailLoc;

	@Column(name = "endLoc", length = 50, nullable = false)
	private String endLoc;

	@Column(name = "numEndLoc", length = 5)
	private int numEnd;

	@Column(name = "complementoEndLoc", length = 10)
	private String compEnd;

	@Column(name = "cidade", length = 20, nullable = false)
	private String cidadeLoc;

	@Column(name = "UFLoc", length = 2, nullable = false)
	private String ufLoc;

	@Column(name = "telefoneLoc", length = 11, nullable = false)
	private String telefoneLoc;

	public String getCpfLoc() {
		return cpfLoc;
	}

	public void setCpfLoc(String cpfLoc) {
		this.cpfLoc = cpfLoc;
	}

	public String getNomeLoc() {
		return nomeLoc;
	}

	public void setNomeLoc(String nomeLoc) {
		this.nomeLoc = nomeLoc;
	}

	public String getEmailLoc() {
		return emailLoc;
	}

	public void setEmailLoc(String emailLoc) {
		this.emailLoc = emailLoc;
	}

	public String getEndLoc() {
		return endLoc;
	}

	public void setEndLoc(String endLoc) {
		this.endLoc = endLoc;
	}

	public int getNumEnd() {
		return numEnd;
	}

	public void setNumEnd(int numEnd) {
		this.numEnd = numEnd;
	}

	public String getCompEnd() {
		return compEnd;
	}

	public void setCompEnd(String compEnd) {
		this.compEnd = compEnd;
	}

	public String getCidadeLoc() {
		return cidadeLoc;
	}

	public void setCidadeLoc(String cidadeLoc) {
		this.cidadeLoc = cidadeLoc;
	}

	public String getUfLoc() {
		return ufLoc;
	}

	public void setUfLoc(String ufLoc) {
		this.ufLoc = ufLoc;
	}

	public String getTelefoneLoc() {
		return telefoneLoc;
	}

	public void setTelefoneLoc(String telefoneLoc) {
		this.telefoneLoc = telefoneLoc;
	}

	@Override
	public String toString() {
		return "Locatario [cpfLoc=" + cpfLoc + ", nomeLoc=" + nomeLoc + ", emailLoc=" + emailLoc + ", endLoc=" + endLoc
				+ ", numEnd=" + numEnd + ", compEnd=" + compEnd + ", cidadeLoc=" + cidadeLoc + ", ufLoc=" + ufLoc
				+ ", telefoneLoc=" + telefoneLoc + "]";
	}

}

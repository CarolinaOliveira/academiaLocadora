package br.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Locacao")
public class Locacao {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idLooc")
	private Long idLoc;

	@Temporal(value = TemporalType.DATE)
	@Column(name = "datainic", nullable = false)
	private Date datainic;

	@Temporal(value = TemporalType.DATE)
	@Column(name = "datafinal", nullable = false)
	private Date datafinal;

	@Column(name = "valorLoc", precision = 6, scale = 2, nullable = false)
	private BigDecimal valorLoc;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "Locatario_CPFLoc", nullable = false, referencedColumnName = "CPFLoc")
	private Locatario Locatario;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "Carro_placa", nullable = false, referencedColumnName = "placa")
	private Carro Carro;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "Atendente_idAtend", nullable = false, referencedColumnName = "idAtend")
	private Atendente Atendente;

	public Long getIdLoc() {
		return idLoc;
	}

	public void setIdLoc(Long idLoc) {
		this.idLoc = idLoc;
	}

	public Date getDatainic() {
		return datainic;
	}

	public void setDatainic(Date datainic) {
		this.datainic = datainic;
	}

	public Date getDatafinal() {
		return datafinal;
	}

	public void setDatafinal(Date datafinal) {
		this.datafinal = datafinal;
	}

	public BigDecimal getValorLoc() {
		return valorLoc;
	}

	public void setValorLoc(BigDecimal valorLoc) {
		this.valorLoc = valorLoc;
	}

	public Locatario getLocatario() {
		return Locatario;
	}

	public void setLocatario(Locatario locatario) {
		Locatario = locatario;
	}

	public Carro getCarro() {
		return Carro;
	}

	public void setCarro(Carro carro) {
		Carro = carro;
	}

	public Atendente getAtendente() {
		return Atendente;
	}

	public void setAtendente(Atendente atendente) {
		Atendente = atendente;
	}
	
	

}

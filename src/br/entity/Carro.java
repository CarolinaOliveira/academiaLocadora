package br.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Carro")
@NamedQueries({@NamedQuery(name = "Carro.listar", query = "SELECT carro FROM Carro carro" ),
@NamedQuery(name = "Carro.buscarPorPlaca", query = "SELECT carro FROM Carro carro WHERE carro.placa = :placa")	
})
public class Carro {

	@Id
	@Column(name = "placa", length = 7, unique = true)
	private String placa;

	@Column(name = "modelo", length = 30, nullable = false)
	private String modelo;

	@Column(name = "anoCarro", length = 4, nullable = false)
	private int anoCar;

	@Column(name = "corCarro", length = 15, nullable = false)
	private String corCar;

	@Column(name = "portas", length = 1, nullable = false)
	private int qtdPorta;

	@Column(name = "precoDiaria", precision = 6, scale = 2, nullable = false)
	private BigDecimal precoDiar;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "Marca_idMarca", referencedColumnName = "idMarca", unique = false)
	private Marca Marca;

	public Marca getMarca() {
		return Marca;
	}

	public void setMarca(Marca marca) {
		Marca = marca;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAnoCar() {
		return anoCar;
	}

	public void setAnoCar(int anoCar) {
		this.anoCar = anoCar;
	}

	public String getCorCar() {
		return corCar;
	}

	public void setCorCar(String corCar) {
		this.corCar = corCar;
	}

	public int getQtdPorta() {
		return qtdPorta;
	}

	public void setQtdPorta(int qtdPorta) {
		this.qtdPorta = qtdPorta;
	}

	public BigDecimal getPrecoDiar() {
		return precoDiar;
	}

	public void setPrecoDiar(BigDecimal precoDiar) {
		this.precoDiar = precoDiar;
	}

	@Override
	public String toString() {
		return "Carro [placa= " + placa + ", modelo= " + modelo + ", anoCar= " + anoCar + ", corCar= " + corCar
				+ ", qtdPorta= " + qtdPorta + ", precoDiar= " + precoDiar + ", Marca= " + Marca + "]";
	}

}

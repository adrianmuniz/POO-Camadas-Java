package br.com.camadas.beans;

public class Veiculo {
	
	private String placa;
	private String modelo;
	private float potencia;
	private int ano;
	private float valorLicenciamento;
	private float AnoLicenciamento;
	
	public Veiculo() {
		
	}

	public Veiculo(String placa, String modelo, int potencia, int ano) {
		this.placa = placa;
		this.modelo = modelo;
		this.potencia = potencia;
		this.ano = ano;
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

	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public float getValorLicenciamento() {
		return valorLicenciamento;
	}

	public void setValorLicenciamento(float valorLicenciamento) {
		this.valorLicenciamento = valorLicenciamento;
	}

	public float getAnoLicenciamento() {
		return AnoLicenciamento;
	}

	public void setAnoLicenciamento(float anoLicenciamento) {
		this.AnoLicenciamento = anoLicenciamento;
	}

	
}

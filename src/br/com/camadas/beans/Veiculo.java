package br.com.camadas.beans;

public class Veiculo {
	
	private String placa;
	private String modelo;
	private float potencia;
	
	public Veiculo() {
		
	}

	public Veiculo(String placa, String modelo, int potencia) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.potencia = potencia;
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
	
	
}

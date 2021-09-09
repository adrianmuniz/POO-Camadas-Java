package br.com.camadas.dao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.camadas.beans.Veiculo;

public class VeiculoDao {
	
	List<Veiculo> bancoVeiculos = new ArrayList<Veiculo>();
	
	//metodo de conex�o com o banco de dados
	
	public VeiculoDao() {
		
	}
	
	public void incluir(Veiculo v) {
		bancoVeiculos.add(v);
	}
	
	public String alterar(String carro) {
			
		}
	
	public String consultar(String model) {
		String resultado = " ";
		for (Veiculo elemento : bancoVeiculos) {
			if (model.equalsIgnoreCase(elemento.getModelo())) {
				resultado += elemento.getModelo() + " - " + elemento.getPlaca() + " - " + elemento.getPotencia();
				return resultado;
			}
		}
			return null;
	}
	
	public void apagar(Veiculo v) {
		bancoVeiculos.remove(v);
	}

	public String listVeiculos() {
		String resultado = "";
		for (Veiculo elemento : bancoVeiculos) {
			resultado += "\nPlaca:" + elemento.getPlaca() + " - " + elemento.getModelo();
		}
		
		return resultado;
	}
	
}

package br.com.camadas.dao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.camadas.beans.Veiculo;

public class VeiculoDao {
	
	List<Veiculo> bancoVeiculos = new ArrayList<Veiculo>();
	
	//metodo de conexão com o banco de dados
	
	public VeiculoDao() {
		
	}
	
	public void incluir(Veiculo v) {
		bancoVeiculos.add(v);
	}
	
	public void alterar() {
			
		}
	
	public Veiculo consultar(String placa) {
		for (Veiculo elemento : bancoVeiculos) {
			if (placa.equalsIgnoreCase(elemento.getPlaca())) {
				return elemento;
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

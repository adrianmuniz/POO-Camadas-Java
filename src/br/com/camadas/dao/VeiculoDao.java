package br.com.camadas.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.camadas.beans.Veiculo;

public class VeiculoDao {
	
	List<Veiculo> bancoVeiculos = new ArrayList<Veiculo>();
	
	//metodo de conexão com o banco de dados
	
	public VeiculoDao() {
		
	}
	
	public void incluir(Veiculo v) {
		bancoVeiculos.add(v);
	}
	
	public void alterar(int posicao, Veiculo v) {
		bancoVeiculos.set(posicao, v);
	}
	
	public void consultar(int posicao) {
		bancoVeiculos.get(posicao);
	}
	
	public void apagar(Veiculo v) {
		bancoVeiculos.remove(v);
	}
	
	
}

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
	
	public void alterar(Veiculo v) {
				v.setModelo(JOptionPane.showInputDialog("Novo modelo:"));
				v.setPotencia(Float.parseFloat(JOptionPane.showInputDialog("Nova Potencia:")));
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
	
	public boolean consultarLicenciamento (String placa) {
		Veiculo v = new Veiculo();
		
		v = consultar(placa);
		if (v.getValorLicenciamento() > 0.0) {
			System.out.println("Já existe um Licenciamento");
			return true;
		}
		return false;
	}

	public void registrar (String placa) {
		Veiculo v = new Veiculo();
		
		boolean licenciamento = consultarLicenciamento(placa);
		
		// Atualizar Licenciamento
		if (licenciamento == true) {
			System.out.println("Atualização de Licenciamento = 2021");
			for (Veiculo cont : bancoVeiculos) {
				float taxalicenciamento = cont.getValorLicenciamento() * 0.5f;
				cont.setValorLicenciamento(taxalicenciamento);
				System.out.println("Licenciamento ATUALIZADO - Valor:" + cont.getValorLicenciamento());
			}
		}
		// Registrar Licenciamento
		else {
			System.out.println("Registrar Licenciamento - 2021");
			for (Veiculo cont : bancoVeiculos) {
				float taxalicenciamento = cont.getAno() * 0.7f;
				cont.setValorLicenciamento(taxalicenciamento);
				cont.setAnoLicenciamento(2021);
				System.out.println("Licenciamento registrado - Valor:" + cont.getValorLicenciamento());
			}
		}
		
	}
}

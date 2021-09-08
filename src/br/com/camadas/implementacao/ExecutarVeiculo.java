package br.com.camadas.implementacao;

import javax.swing.JOptionPane;

import br.com.camadas.beans.Veiculo;
import br.com.camadas.dao.VeiculoDao;

public class ExecutarVeiculo {

	public static void main(String[] args) {
		
		Veiculo v = new Veiculo();
		
		VeiculoDao dao = new VeiculoDao();
		
		v.setPlaca(JOptionPane.showInputDialog("Placa: "));
		v.setPotencia(Float.parseFloat(JOptionPane.showInputDialog("Potencia: ")));
		v.setModelo(JOptionPane.showInputDialog("Modelo: "));
		
		dao.incluir(v);
		
		System.out.println(v);
		
	}

}

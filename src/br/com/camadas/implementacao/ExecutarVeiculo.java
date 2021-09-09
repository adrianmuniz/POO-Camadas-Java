package br.com.camadas.implementacao;

import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.camadas.beans.Veiculo;
import br.com.camadas.dao.VeiculoDao;

public class ExecutarVeiculo {

	public static void main(String[] args) {
		
		VeiculoDao dao = new VeiculoDao();
		
		Scanner s = new Scanner (System.in);
		
		char opc = ' ';
		
		do {
			System.out.println("Controle de Veiculo");
			System.out.println("Menu: <C>reat  <R>ead  <U>pdate  <D>elete  <L>ist");
			opc = s.nextLine().toUpperCase().charAt(0);
			
			switch (opc) {
			
			case 'C' :
				Veiculo v = new Veiculo();
				v.setModelo(JOptionPane.showInputDialog("Modelo: "));
				v.setPlaca(JOptionPane.showInputDialog("Placa: "));
				v.setPotencia(Float.parseFloat(JOptionPane.showInputDialog("Potencia: ")));
				
				dao.incluir(v);
				break;
			 case 'R' :
				 String model = JOptionPane.showInputDialog("Qual carro quer consultar?");
				 
				 System.out.println(dao.consultar(model));
				 
				 break;
			 case 'U' :
				 String carro = JOptionPane.showInputDialog("Qual carro deseja alterar?");
				 
				 break;
			 case 'D' :
				 System.out.println("Apagar");
				 break;
			 case 'L' :
				 System.out.println(dao.listVeiculos());
				 break;
			}	 
		} while (opc != 'E'); 
			
		System.out.println("Funcionou!");
		
		s.close();
	}

}

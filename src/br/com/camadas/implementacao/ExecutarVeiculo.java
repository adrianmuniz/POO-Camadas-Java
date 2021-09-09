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
		String placa;
		
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
				 Veiculo vconsulta = new Veiculo();
				 placa = JOptionPane.showInputDialog("Qual carro quer consultar?");
				 vconsulta = dao.consultar(placa);
				 JOptionPane.showMessageDialog(null,"\nPlaca: " + vconsulta.getPlaca() + "\nModelo: " + vconsulta.getModelo());
				 break;
			 case 'U' :
				 placa = JOptionPane.showInputDialog("Digite a placa do carro que deseja alterar:");
				 vconsulta = dao.consultar(placa);
				 dao.alterar(vconsulta);
				 break;
			 case 'D' :
				 placa = JOptionPane.showInputDialog("Digite a placa do carro que deseja apagar:");
				 vconsulta = dao.consultar(placa);
				 dao.apagar(vconsulta);
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

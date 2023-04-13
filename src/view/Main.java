package view;

import javax.swing.JOptionPane;

import controlle.FatController;

public class Main 
{
	
	public static void main(String[] args)
	{
		FatController pilha = new FatController();
		
		pilha.fat(Integer.parseInt(JOptionPane.showInputDialog("Digite um valor de 0 a 10!")));
		
		
	}
	
	
	

}

package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteVetor {

	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real (String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) {
		Produto[] vetorProduto = new Produto[5];
		
		int indice = 0;
		
		do {
			vetorProduto[indice] = new Produto();
			vetorProduto[indice].setTipo(texto("Tipo do produto"));
			vetorProduto[indice].setMarca(texto("Digite a Marca"));
			vetorProduto[indice].setQuantidade(inteiro("Quantidade"));
			vetorProduto[indice].setValor(real("Valor"));
			
			indice ++;
		}while(JOptionPane.showConfirmDialog(null, "Deseja adicionar mais produtos?", "Carrinho de compras", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) ==0);
		
		for(int contador = 0; indice > contador; contador++){
			System.out.println("Tipo: " + vetorProduto[contador].getTipo() + 
					"\nMarca: " + vetorProduto[contador].getMarca() + 
					"\nQuantidade" + vetorProduto[contador].getQuantidade() +
					"\nValor" + vetorProduto[contador].getValor()
					);
		}
		
	}
	

}

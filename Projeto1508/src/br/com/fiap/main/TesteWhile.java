package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteWhile {
	
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j)); 
	}
	
	static double valorTotal(Produto[] p, int i) {
		double total = 0;
		
		for(int c = 0; c < i; c++) {
			total+= p[c].getValor() * p[c].getQuantidade();
		}
		
		return total;
	}

	public static void main(String[] args) {
		
		Produto[] vetorProduto = new Produto[3];
		int indice = 0;
		int continuar =0;
		while ( continuar == 0) {
			vetorProduto[indice] = new Produto();
			vetorProduto[indice].setTipo(texto("tipo"));
			vetorProduto[indice].setMarca(texto("Marca"));
			vetorProduto[indice].setQuantidade(inteiro("Quantidade"));
			vetorProduto[indice].setValor(real("Valor"));
			
			indice ++;
					
			continuar = JOptionPane.showConfirmDialog(null, "Adicionar produto? ", "Carrinho de compras" ,
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			
		}
		
		for(int contador = 0; contador < indice; contador ++) {
			System.out.println("Tipo: " + vetorProduto[contador].getTipo() +
					"\nMarca: " + vetorProduto[contador].getMarca() + 
					"\nQuantidade: " + vetorProduto[contador].getQuantidade() + 
					"\nValor: " + vetorProduto[contador].getValor());
		}
		
		System.out.println("VALOR TOTAL" + valorTotal(vetorProduto, continuar));

	}

}

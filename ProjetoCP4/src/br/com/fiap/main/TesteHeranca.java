package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Pf;
import br.com.fiap.beans.Pj;

public class TesteHeranca {
	
	static String texto (String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro (String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double decimal (String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j)) ;
	}
	
	public static void main(String[] args) {
//String nome, String email, int idade, double renda, String rg, String cpf		
		Pf objPf = new Pf(texto("Seu nome"),
				texto("Seu email"),
				inteiro("Sua idade"),
				decimal("Sua renda"),
				texto("Seu RG"),
				texto("Seu CPF"));
//String nome, String email, int idade, double renda, String razaoSocial, String cnpj		
		Pj objPj = new Pj(texto("Nome da empresa"),
				texto("Email da empresa"),
				inteiro("Idade da empresa"),
				decimal("Renda da empresa"),
				texto("Razão social da empresa"),
				texto("CNPJ da empresa"));
		
		Endereco objEndereco = new Endereco(texto("Logradouro"),
				inteiro("Numero"),
				texto("CEP"));
		
		
		System.out.println();
	}

}

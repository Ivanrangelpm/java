package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.PJ;
import br.com.fiap.beans.Pf;

public class PessoaTeste {

	//Static
	//String
	static String texto (String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro (String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double decimal (String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	
	
	
	public static void main(String[] args) {
		
//String nome, String email, int idade, double renda, String razaoSocial, String cnpj
		PJ objPJ = new PJ(texto("Digite o nome da empresa"),
				texto("Digite o email da empresa"),
				inteiro("Digite a idade da empresa"),
				decimal("Digite a renda da empresa"),
				texto("Digite a razão social da empresa"),
				texto("Digite o CNPJ da empresa"));
		
//String nome, String email, int idade, double renda, String rg, String cpf		
		Pf objPf = new Pf(texto("Digite seu nome"),
				texto("Digite seu email"),
				inteiro("Digite sua idade"),
				decimal("Digite sua idade"),
				texto("Digite seu RG"), 
				texto("Digite seu CPF"));
		
		
		Endereco objEndereco = new Endereco(texto("Digite seu logradouro"),
				inteiro("Digite seu numero"));
		
		
		System.out.println("DADOS DA EMPRESA: ");
		System.out.println("\nNome: " + objPJ.getNome() +
				"\nEmail: " + objPJ.getEmail() +
				"\nIdade: " + objPJ.getIdade() +
				"\nRenda: " + objPJ.getRenda() + 
				"\nRazão social: " + objPJ.getRazaoSocial() +
				"\nCNPJ: " +objPJ.getCnpj() +
				"\nIdentificador: " + objPJ.identificador());
		
		System.out.println("\nDADOS DA PESSOA: ");
		System.out.println("\nNome: " + objPf.getNome() +
				"\nEmail: " + objPf.getEmail() +
				"\nIdade: " + objPf.getIdade() + 
				"\nRenda: " + objPf.getRenda() +
				"\nRG: " + objPf.getRg() + 
				"\nCPF: " + objPf.getCpf() +
				"\nIdentificador: " + objPf.identificador());
		
		System.out.println("\nENDEREÇO");
		System.out.println("\nLogradouro: " + objEndereco.getLogradouro() +
				"\nNumero: " + objEndereco.getNumero());
	}

}

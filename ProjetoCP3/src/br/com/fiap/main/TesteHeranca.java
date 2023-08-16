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
	
	static Double decimal (String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) {
		
//String nome, String email, int idade, double renda, String rg, String cpf
		Pf objPf = new Pf(texto("Digite seu nome"),
				texto("Digite seu email"),
				inteiro("Digite sua idade"),
				decimal("Digite sua renda"),
				texto("Digite seu RG"),
				texto("Digite seu CPF"));
//String nome, String email, int idade, double renda, String razaoSocial, String cnpj
		Pj objPj = new Pj(texto("Digite o nome da empresa"),
				texto("Digite o email da empresa"),
				inteiro("Digite a idade da empresa"),
				decimal("Digite a renda da empresa"),
				texto("Digite a razão Social da empresa"),
				texto("Digite o CNPJ da empresa"));
		
//String logradouro, int numero, String cep
		Endereco objEndereco = new Endereco(texto("Logradouro"),
				inteiro("Numero"),
				texto("CEP"));
		
		System.out.println("INFOMAÇÕES PESSOA");
		System.out.println("\nNome: " + objPf.getNome() +
				"\nEmail: " + objPf.getEmail() + 
				"\nIdade: " + objPf.getIdade() + 
				"\nRenda: " + objPf.getRenda() + 
				"\nRG: " + objPf.getRg() + 
				"\nCPF: " + objPf.getCpf());
		System.out.println("\nINFORMAÇÕES DA EMPRESA");
		System.out.println("\nNome: " + objPj.getNome() +
				"\nEmail: " + objPj.getEmail() +
				"\nIdade: " + objPj.getIdade() +
				"\nRenda: " + objPj.getRenda() + 
				"\nRazão social: " + objPj.getRazaoSocial() +
				"\nCNPJ: " + objPj.getCnpj());
		System.out.println("\nENDERECO");
		System.out.println("\nLogradouro: " + objEndereco.getLogradouro() + 
				"\nNumero: " + objEndereco.getNumero() + 
				"\nCEP: " + objEndereco.getCep());
	}
	
	


}

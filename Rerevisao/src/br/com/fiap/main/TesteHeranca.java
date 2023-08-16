package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Pf;
import br.com.fiap.beans.Pj;

public class TesteHeranca {

	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double decimal(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) {
//String nome, String email, int idade, double renda, String rg, String cpf
		Pf objPf = new Pf(
				texto("Digite seu nome"),
				texto("Digite seu email"),
				inteiro("Digite sua idade"),
				decimal("Digite sua renda"),
				texto("Digite seu RG"),
				texto("Digite seu CPF")
				);
//String nome, String email, int idade, double renda, String razaoSocial, String cnpj		
		Pj objPj = new Pj(
				texto("Digite o nome da sua empresa"),
				texto("Digite o email da sua empresa"),
				inteiro("Digite a idade da sua empresa"),
				decimal("Digite a renda da sua empresa"),
				texto("Digite a razão social da sua empresa"),
				texto("digite o CNPJ da sua empresa")
				);
//String logradouro, int numero, String cep		
		Endereco objEndereco = new Endereco(
				texto("Digite o logradouro"),
				inteiro("Digite um numero"),
				texto("Digite um CEP")
				);
		
		System.out.println("DADOS PESSOAIS");
		System.out.println("\nNome: " + objPf.getNome() + 
				"\nEmail: " + objPf.getEmail() + 
				"\nIdade: " + objPf.getIdade() + 
				"\nRenda: " + objPf.getRenda() + 
				"\nRG: " + objPf.getRg() + 
				"\nCPF: " + objPf.getCpf()
				);
		System.out.println("\nDADOS DA EMPRESA");
		System.out.println("\nNome da empresa: " + objPj.getNome() + 
				"\nEmail da empresa: " + objPj.getEmail() + 
				"\nIdade da empresa: " + objPj.getIdade() + 
				"\nRenda da empresa: " + objPj.getRenda() + 
				"\nRazão Social: " + objPj.getRazaoSocial() + 
				"\nCNPJ: " + objPj.getCnpj()
				);
		
		System.out.println("\nENDEREÇO DA EMPRESA");
		System.out.println("\nLogradouro: " + objEndereco.getLogradouro() + 
				"\nNúmero: " + objEndereco.getNumero() +
				"\nCEP: " + objEndereco.getCep()
				);
	}

}

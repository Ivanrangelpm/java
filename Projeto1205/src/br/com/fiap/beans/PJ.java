package br.com.fiap.beans;

public class PJ extends Pessoa{
	private String razaoSocial;
	private String cnpj;
	
	
	//vazio
	public PJ() {
		super();
	}


	//cheio
	public PJ(String razaoSocial, String cnpj) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}

	//Herança
	public PJ(String nome, String email, int idade, double renda, String razaoSocial, String cnpj) {
		super(nome, email, idade, renda);
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}


	public String getRazaoSocial() {
		return razaoSocial;
	}


	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String identificador(){
		return "PESSOA JURIDICA";
	}

	 
	
	
	
}

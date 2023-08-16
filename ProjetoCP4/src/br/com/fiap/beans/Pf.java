package br.com.fiap.beans;

public class Pf extends Pessoa{
	private String rg;
	private String cpf;
	
	public Pf() {
		super();
	}

	public Pf(String rg, String cpf) {
		super();
		this.rg = rg;
		this.cpf = cpf;
	}

	public Pf(String nome, String email, int idade, double renda, String rg, String cpf) {
		super(nome, email, idade, renda);
		this.rg = rg;
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}

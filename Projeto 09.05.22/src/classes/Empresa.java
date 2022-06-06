package classes;

import java.util.ArrayList;

import Interface.CalcularTotal;

public class Empresa implements CalcularTotal {
	private String nome;
	private String cnpj;
	private String endereco;
	private Estrutura estrutura=new Estrutura();
	private ArrayList<Pessoa>Pessoas=new ArrayList<Pessoa>();
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCnpj() {
		return this.cnpj;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public ArrayList<Pessoa> getPessoas(){
		return this.Pessoas;
	}
	
	public Estrutura getEstrutura() {
		return this.estrutura;
	}
	
	public void setNome(String nome) {
		 this.nome=nome;
	} 
	
	public void setCnpj(String cnpj) {
		this.cnpj=cnpj;
	}
	
	public void setEndereco(String endereco) {
		this.endereco=endereco;
	}
	
	public void setEstrutura(Estrutura estrutura) {
		this.estrutura=estrutura;
	}
	
	public void setPessoas(Pessoa Pessoas) {
		this.Pessoas.add(Pessoas);
	}

	@Override
	
	public void CalcularTotal() {
		System.out.println(this.Pessoas.size());		
	}

	

}

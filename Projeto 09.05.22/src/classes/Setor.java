package classes;

import java.util.ArrayList;

import Interface.CalcularTotal;

public class Setor implements CalcularTotal{
	
	private String descricao;
	private int codigo;
	private ArrayList<Pessoa>Pessoas=new ArrayList<Pessoa>();
	
	public String getDescricao() {
		return this.descricao;
	}

	public int getCodigo() {
		return this.codigo;
	}

	public ArrayList<Pessoa> getPessoas() {
		return this.Pessoas;
	}

	public void setDescricao(String descricao) {
		this.descricao=descricao;
	}
	
	public void setCodigo(int codigo) {
		this.codigo=codigo;
	}

	public void setPessoas(Pessoa Pessoas) {
		this.Pessoas.add(Pessoas);
	}


	@Override
	
	public void CalcularTotal() {
		System.out.println(this.Pessoas.size());		
	}
	
	
	
}

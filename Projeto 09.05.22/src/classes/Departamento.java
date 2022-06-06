package classes;

import java.util.ArrayList;

import Interface.CalcularTotal;

public class Departamento implements CalcularTotal {
	
	private String descricao;
	private int codigo;
	private ArrayList<Setor>Setores=new ArrayList<Setor>();
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public ArrayList<Setor> getSetores(){
		return this.Setores;
	}
	
	public void setDescricao(String descricao) {
		this.descricao=descricao;
	}
	
	public void setCodigo(int codigo) {
		this.codigo=codigo;
	}
	
	public void setSetores(Setor Setores) {
		this.Setores.add(Setores);
	}
	
	@Override
	
	public void CalcularTotal() {
		System.out.print(Setores.size());
	}
	

}

package classes;

import java.util.ArrayList;

import Interface.CalcularTotal;

public class Estrutura implements CalcularTotal {
	
	private int codigo;
	private String nome;
	private ArrayList <Departamento>Departamentos= new ArrayList<Departamento>();

	public int getCodigo() {
		return this.codigo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public ArrayList<Departamento> getDepartamentos(){
		return this.Departamentos;
	}
	
	public void setCodigo(int codigo) {
		this.codigo=codigo;
	}
	
	public void setNome(String nome) {
		 this.nome=nome;
	} 
	
	public void setDepartamentos(Departamento Departamentos) {
		this.Departamentos.add(Departamentos);
	}
	
	@Override
	
	public void CalcularTotal() {
		System.out.print(Departamentos.size());
	}
	
}

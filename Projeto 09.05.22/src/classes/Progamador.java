package classes;

public class Progamador extends Profissional {
	
	private double cargaHoraria;
	private double salario;

	
	public double getCargaHoraria(){
		return this.cargaHoraria;
	}

	public double getSalario(){
		return this.salario;
	}

	public void setCargaHoraria(double cargaHoraria) {
		this.cargaHoraria= cargaHoraria;
	}

	public void setSalario(double salario) {
		this.cargaHoraria= salario;
	}	
	
}
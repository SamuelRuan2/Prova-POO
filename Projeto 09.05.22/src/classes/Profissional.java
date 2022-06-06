package classes;

public class Profissional extends Pessoa {
	
	private int matricula;
	private String cargo;

	public int getMatricula() {
		return this.matricula;
	}

	public String getCargo() {
		return this.cargo;
	}

	public void setMatricula(int matricula) {
		this.matricula=matricula;
	}
	
	public void setCargo(String cargo) {
		 this.cargo=cargo;
	}
	
}

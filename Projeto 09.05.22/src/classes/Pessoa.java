package classes;

public class Pessoa {

	private String nome;
	private String cpf;
	private String dataNascimento;
	
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public String getDataNascimento() {
		return this.dataNascimento;
	}

	public void setNome(String nome) {
		 this.nome=nome;
	} 
	
	public void setCpf(String cpf) {
		this.cpf=cpf;
	}
	
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento=dataNascimento;
	}
	
	
}

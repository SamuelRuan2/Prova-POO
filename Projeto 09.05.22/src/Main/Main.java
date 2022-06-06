package Main;

import classes.Departamento;
import classes.Empresa;
import classes.Estrutura;
import classes.OperadorMaquinas;
import classes.Pessoa;
import classes.Progamador;
import classes.Setor;

public class Main {
	public static void main(String args[]) {
		
	
		
		
		
		
		OperadorMaquinas op1=new OperadorMaquinas();
		op1.setNome("Gabriel");
		op1.setCpf("000.000.000-00");
		op1.setDataNascimento("25/12/2001");
		op1.setMatricula(010110);
		op1.setCargo("Encarregado");
		op1.setCargaHoraria(58.30);
		op1.setSalario(2000.00);
		
		
		OperadorMaquinas op2=new OperadorMaquinas();
		op2.setNome("Abel");
		op2.setCpf("000.000.000-00");
		op2.setDataNascimento("24/10/2000");
		op2.setMatricula(010111);
		op2.setCargo("Operador");
		op2.setCargaHoraria( 58.30);
		op2.setSalario(1200.00);
		
		
		Progamador p1=new Progamador();
		p1.setNome("Samuel");
		p1.setCpf("000.000.000-00");
		p1.setDataNascimento("12/05/2002");
		p1.setMatricula(101010);
		p1.setCargo("Gerente");
		p1.setCargaHoraria(50.00);
		p1.setSalario(5000.00);
		
		
		Progamador p2=new Progamador();
		p2.setNome("Jonas");
		p2.setCpf("000.000.000-00");
		p2.setDataNascimento("29/08/1995");
		p2.setMatricula(101010);
		p2.setCargo("Encarregado");
		p2.setCargaHoraria(52.00);
		p2.setSalario(4000.00);
		
		
		Setor s1=new Setor();
		s1.setCodigo(01);
		s1.setDescricao("Setor da Adiministração");
		s1.setPessoas(p1);
		s1.setPessoas(op1);
		
		
		Setor s2=new Setor();
		s2.setCodigo(02);
		s2.setDescricao("Setor de coleta de dados");
		s2.setPessoas(p2);
		s2.setPessoas(op2);
		
		
		Departamento d1 = new Departamento();
		d1.setCodigo(001);
		d1.setDescricao("Departamento Administrativo");
		d1.setSetores(s1);
		
		
		Departamento d2 = new Departamento();
		d2.setCodigo(002);
		d2.setDescricao("Departamento Geral");
		d2.setSetores(s2);
		
		Estrutura e1 = new Estrutura();
		e1.setCodigo(1234);
		e1.setNome("Predio Principal");
		e1.setDepartamentos(d1);
		e1.setDepartamentos(d2);
		
		Empresa empresa =new Empresa();
		empresa.setCnpj("00.000.000/0001-00");
		empresa.setEndereco("Rua São Jorge Nº 345");
		empresa.setEstrutura(e1);
		empresa.setPessoas(p1);
		empresa.setPessoas(p2);
		empresa.setPessoas(op1);
		empresa.setPessoas(op2);
		
		
		
		
		System.out.println("                                                                                            Minha Empresa");
		System.out.println("Cnpj: " + empresa.getCnpj());
		System.out.println("Endereço: "+ empresa.getEndereco());
		System.out.println("");
		System.out.println("=========================================================================================================================================================================================");
		System.out.println("                                                                                             Departamentos");
		System.out.println("=========================================================================================================================================================================================");
		System.out.println("");
		
		System.out.println("");
		System.out.print("Total de Departamentos: ");
		e1.CalcularTotal();
		System.out.println("");
		
		for (Departamento departamento : e1.getDepartamentos()){
			
				
			System.out.println("");
			System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
			System.out.println("");
			System.out.println(""+departamento.getDescricao());
			System.out.println("Codigo: "+departamento.getCodigo());
			System.out.println("");
			System.out.println("=========================================================================================================================================================================================");
			System.out.println("                                                                                       Setores no " +departamento.getDescricao());
			System.out.println("=========================================================================================================================================================================================");
			System.out.println("");
			
			System.out.println("");
			System.out.print("Total de setores no departamento: ");
			departamento.CalcularTotal();
			System.out.println("");
			System.out.println("");
			
			for(Setor setor: departamento.getSetores()) {
				
			
			System.out.println(setor.getDescricao());
			System.out.println("Setor Numero: "+setor.getCodigo());
			
			System.out.println("");
			System.out.println("=========================================================================================================================================================================================");
			System.out.println("                                                                                      Pessoas no "+setor.getDescricao());
			System.out.println("=========================================================================================================================================================================================");
			System.out.println("");
			
			System.out.println("");
			System.out.print("Total de pessoas no setor: ");
			setor.CalcularTotal();
			System.out.println("");

			
			for (Pessoa pessoa:setor.getPessoas()) {
			
			System.out.println("Nome: "+pessoa.getNome());
			System.out.println("CPF: "+pessoa.getCpf());
			System.out.println("Data de nascimento: "+pessoa.getDataNascimento());
			System.out.println("");
			
			
		}
		}
		}
			System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
			
			System.out.println("");
			System.out.println("=========================================================================================================================================================================================");
			System.out.println("                                                                                             Pessoas na Empresa");
			System.out.println("=========================================================================================================================================================================================");
			System.out.println("");
			System.out.print("Total de pessoas na empresa: ");
			empresa.CalcularTotal();
			System.out.println("");
			for (Pessoa pessoa:empresa.getPessoas()) {
			System.out.println("Nome: "+pessoa.getNome());
			System.out.println("CPF: "+pessoa.getCpf());
			System.out.println("Data de nascimento: "+pessoa.getDataNascimento());
			System.out.println("");
			}
			  
			
			
			
		
}
}
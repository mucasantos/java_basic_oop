package aula_teste;

import java.util.Date;

public class Professor extends Pessoa {
	public Professor(String _nome, String _cpf, Date _data, double salario, String disciplina) {
		super(_nome, _cpf, _data);
		this.salario = salario;
		this.disciplina = disciplina;
	}
	public double salario;
	public String disciplina;
}
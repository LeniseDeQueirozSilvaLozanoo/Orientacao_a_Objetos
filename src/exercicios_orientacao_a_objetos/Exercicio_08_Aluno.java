package exercicios_orientacao_a_objetos;

public class Exercicio_08_Aluno {

	private String nome;
	private double nota1;
	private double nota2;
	
	public Exercicio_08_Aluno(String nome, double nota1, double nota2) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	public double media(double nota1, double nota2) {
		return (nota1 + nota2) / 2;
	}
	
	public boolean situacao(double media) {
		if(media >= 6.0) {
			return true;
		}else return false;
	}
	
	
	
	

}

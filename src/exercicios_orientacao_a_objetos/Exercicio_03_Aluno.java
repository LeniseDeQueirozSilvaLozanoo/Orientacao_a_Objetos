package exercicios_orientacao_a_objetos;

public class Exercicio_03_Aluno {

	String nome;
	double nota1;
	double nota2;
	double nota3;
	
	public String avalicao() {
		double notaFinal = nota1 + nota2 + nota3;
		if(notaFinal >= 60) {
			return notaFinal + "\nAprovado";
			} else return notaFinal + "\nReprovado\nFaltaram " + (100-notaFinal) + " pontos"; 
	}
	
	public String toString() {
		return "\nNota final: " + avalicao();
	}
	
	
}





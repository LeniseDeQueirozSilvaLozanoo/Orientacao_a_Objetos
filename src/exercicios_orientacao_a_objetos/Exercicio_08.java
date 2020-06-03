package exercicios_orientacao_a_objetos;

import java.util.Scanner;

public class Exercicio_08 {

	public static void main(String[] args) {
		
//		Desenvolver uma classe chamada Aluno com os seguintes atributos: nome, nota da prova 1 e
//		nota da prova 2. A classe dever� ter os seguintes m�todos:
//		i) alterar o nome do aluno, nota da prova 1 e nota da prova 2 ;
//		ii) calcular a m�dia aritm�tica simples;
//		iii) verificar se um aluno foi aprovado (m�dia >= 6.0). Este m�todo dever� retornar um
//		valor booleano (true ou false);
//		iv) retornar o nome, m�dia e a situa��o do aluno (aprovado ou reprovado);
//		Teste a classe, instanciando objetos e chamando os m�todos. 
		
		Scanner sc = new Scanner(System.in);
		Exercicio_08_Aluno aluno = new Exercicio_08_Aluno(null, 0, 0);
		String situacao = "";

		System.out.println("Digite o nome e as duas notas do aluno");
		aluno.setNome(sc.next());
		aluno.setNota1(sc.nextDouble());
		aluno.setNota2(sc.nextDouble());
		
		if(aluno.situacao (aluno.media(aluno.getNota1(), aluno.getNota2())) == true) {
			situacao = "Aprovado";
		}else {
			situacao = "Reprovado";
			}
		
		System.out.println("\nNome: " + aluno.getNome() 
		+ "\nM�dia: " + aluno.media(aluno.getNota1(), aluno.getNota2()) 
		+ "\nSitua�ao: " + situacao);
		
		sc.close();

	}

}

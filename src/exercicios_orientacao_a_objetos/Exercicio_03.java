package exercicios_orientacao_a_objetos;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Exercicio_03_Aluno aluno = new Exercicio_03_Aluno();
		
		System.out.println("Digite o nome do aluno e as 3 notas");
		aluno.nome = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();

		System.out.println(aluno);
	}

}

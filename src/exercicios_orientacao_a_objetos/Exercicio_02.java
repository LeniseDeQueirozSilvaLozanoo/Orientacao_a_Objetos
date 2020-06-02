package exercicios_orientacao_a_objetos;

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Exercicio_02_Funcionario funcionario = new Exercicio_02_Funcionario();
		
		System.out.println("Digite o nome do funcionario, o salario bruto e a taxa");
		funcionario.nome = sc.nextLine();
		funcionario.salarioBruto = sc.nextDouble();
		funcionario.taxa = sc.nextDouble();
		
		System.out.println(funcionario + "\n\nAumento salarial?");
		funcionario.aumentoSalario(sc.nextDouble());
		System.out.println(funcionario);
		
		
		
		
		
		
		sc.close();

	}

}

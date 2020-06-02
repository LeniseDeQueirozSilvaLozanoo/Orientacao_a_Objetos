package exercicios_orientacao_a_objetos;

import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {
		
//		Desenvolva uma classe chamada Quadrado com os seguintes atributos: base e altura. Desenvolva o método 
//		construtor com e sem argumentos, métodos para calcular e retornar o perímetro e a área. 
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Digite a base e a altura do quadrado");
		Exercicio_05_Quadrado quadrado = new Exercicio_05_Quadrado(sc.nextDouble(), sc.nextDouble());
		System.out.println(quadrado);
		
		sc.close();

	}

}

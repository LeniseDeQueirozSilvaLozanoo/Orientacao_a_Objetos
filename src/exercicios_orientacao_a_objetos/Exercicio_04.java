package exercicios_orientacao_a_objetos;

import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		
//		Desenvolver uma classe chamada Hora contendo os atributos: horas, minutos e segundos. O m�todo construtor 
//		dever� ter m�todos para validar os valores dos atributos. Quando o valor n�o for v�lido dever� ser atribu�do 
//		o valor 0. Em seguida, escreva um programa Java (uma classe contendo o m�todo main()) para testar a classe Hora.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a hora, minuto e segundo");
		Exercicio_04_Hora hora = new Exercicio_04_Hora(sc.nextInt(),sc.nextInt(),sc.nextInt());
		System.out.println(hora);
		
		sc.close();

	}

}

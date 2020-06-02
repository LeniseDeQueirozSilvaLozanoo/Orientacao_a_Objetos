package exercicios_orientacao_a_objetos;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Exercicio_01_Retangulo retangulo = new Exercicio_01_Retangulo();
		
		System.out.println("Digite a altura e a largura do retangulo");
		retangulo.altura = sc.nextDouble();
		retangulo.largura = sc.nextDouble();
		
		System.out.println(retangulo );
		
		sc.close();

	}

}

package exercicios_orientacao_a_objetos;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Exercicio_01_Retangulo retangulo = new Exercicio_01_Retangulo(0, 0);
		
		System.out.println("Digite a altura e a largura do retangulo");
		retangulo.setAltura(sc.nextDouble());
		retangulo.setLargura(sc.nextDouble()); 
		
		System.out.println(retangulo );
		
		sc.close();

	}

}

package exercicios_orientacao_a_objetos;

import java.util.Scanner;

public class Exercicio_07 {

	public static void main(String[] args) {
		
//		Desenvolver uma classe chamada Círculo contendo apenas o raio como atributo. A classe deverá ter métodos para
//		alterar o valor do raio, retornar o valor do raio, calcular a área e o perímetro. O raio do círculo é dado por: 
//		2 πr , onde r é o raio. O perímetro é calculado por: 2πr, onde r é o raio. Teste a classe, instanciando objetos e 
//		chamando os métodos. O valor de π pode ser obtido a partir da constante Math.PI, do pacote java.lang.

	
	Scanner sc = new Scanner(System.in);
	
	Exercicio_07_Circulo circulo = new Exercicio_07_Circulo(0);
	
	System.out.println("Digite o raio do círculo");
	
	double raio = sc.nextDouble();
	circulo.setRaio(raio);
	
	System.out.printf("%nO raio digitado foi:  = %.2f%nÁrea: = %.2f %nPerímetro: = %.2f" , circulo.getRaio() , circulo.area(raio)  , circulo.perimetro(raio));
	
	
	sc.close();
	
	
	}

}

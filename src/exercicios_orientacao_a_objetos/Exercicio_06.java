package exercicios_orientacao_a_objetos;

import java.util.Scanner;

public class Exercicio_06 {

	public static void main(String[] args) {
		
//		Desenvolver uma classe chamada Ponto que será utilizar para instanciar pontos do plano cartesiano (coordenadas x e y).
//		A classe deve ter um método para calcular a distância entre dois pontos. Considere dois pontos quaisquer P1(x1, y1)
//		e P2(x2, y2). Teste a classe, instanciando objetos e chamando os métodos.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os pontos do planos cartesiano (coordenadas de x e y)");
		Exercicio_06_Ponto ponto = new Exercicio_06_Ponto(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		System.out.println(ponto);
		
		
		sc.close();

	}

}

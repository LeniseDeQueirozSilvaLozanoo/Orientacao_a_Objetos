package exercicios_orientacao_a_objetos;

import java.util.Scanner;

public class Exercicio_09 {

	public static void main(String[] args) {
		
//		Criar uma classe para representar uma temperatura que pode ser acessada nas escalas Celsius, Kelvin e Farenheit. 
//		Teste a classe, instanciando objetos e chamando os métodos. As expressões para conversão de temperatura são representadas abaixo.
//		C representa a temperatura na escala Celsius, F representa a temperatura na escala Farenheit e K representa a temperatura na escala Kelvin. 

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura atual (apenas números): ");
		double tempAtual = sc.nextDouble();
		System.out.println("Digite a escala da temperatura atual (C, K, ou F): ");
		String escalaAtual = sc.next();
		System.out.println("Digite a escala desejada (C, K, ou F): ");
		String escalaDeseja = sc.next();
		
		Exercicio_09_Temperatura temperatura = new Exercicio_09_Temperatura(tempAtual);
		
		if (escalaAtual.equals("C") && escalaDeseja.equals("F")) {

			System.out.printf("%.2f°F",temperatura.celsiusParaFarenheit(temperatura.getTemp()));
		}
		else if (escalaAtual.equals("C") && escalaDeseja.equals("K")) {

			System.out.printf("%.2f°K",temperatura.celsiusParaKelvin(temperatura.getTemp()));
		}
		else if (escalaAtual.equals("F") && escalaDeseja.equals("C")) {

			System.out.printf("%.2f°C",temperatura.farenheitParaCelsius(temperatura.getTemp()));
		}
		else if (escalaAtual.equals("F") && escalaDeseja.equals("K")) {

			System.out.printf("%.2f°K",temperatura.farenheitParaKelvin(temperatura.getTemp()));
		}
		
		else if (escalaAtual.equals("K") && escalaDeseja.equals("C")) {

			System.out.printf("%.2f°C",temperatura.kelvinParaCelsius(temperatura.getTemp()));
		}
		else if (escalaAtual.equals("K") && escalaDeseja.equals("F")) {

			System.out.printf("%.2f°F",temperatura.kelvinParaFarenheit(temperatura.getTemp()));
		} else {
			System.out.println("Escala inválida");
		}

		
	
		sc.close();
	}

}

package exercicios_orientacao_a_objetos;

public class Exercicio_05_Quadrado {
	
	double base;
	double altura;
	
	public Exercicio_05_Quadrado(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public Exercicio_05_Quadrado() {
	}
	
	public double perimetro(double base, double altura) {
		return (base*2) + (altura*2);
	}
	
	public double area(double base, double altura) {
		return base*altura;
	}
	
	public String toString() {
		return "Área: " + String.format("%.2f", area(base, altura)) + "\nPerímetro: " + String.format("%.2f", perimetro(base, altura));
	}
}

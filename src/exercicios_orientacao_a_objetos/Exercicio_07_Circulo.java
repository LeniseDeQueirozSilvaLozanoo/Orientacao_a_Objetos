	package exercicios_orientacao_a_objetos;

public class Exercicio_07_Circulo {
	
	private double raio;

	public Exercicio_07_Circulo(double raio) {
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double area(double raio) {
		return Math.PI*Math.pow(raio, 2);
	}
	
	public double perimetro(double raio) {
		return (2*Math.PI)*raio;
	}
	
}

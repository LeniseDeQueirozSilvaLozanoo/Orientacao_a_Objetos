package exercicios_orientacao_a_objetos;

public class Exercicio_01_Retangulo {
	
	private double altura;
	private double largura;
	
	
	public Exercicio_01_Retangulo(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}
	

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double area() {
		return altura*largura;
	}
	
	public double perimetro() {
		return 2*(largura + altura);
	}
	
	public double diagonal() {
		return Math.sqrt((Math.pow(largura, 2) + Math.pow(altura, 2)));
	}
	
	public String toString() {
		return "Area: " + String.format("%.2f", area()) + "\nPer�metro: " + String.format("%.2f", perimetro()) +
				"\nDiagonal: " + String.format("%.2f", diagonal());
	}

}

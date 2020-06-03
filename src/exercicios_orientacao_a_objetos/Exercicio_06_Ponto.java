package exercicios_orientacao_a_objetos;

public class Exercicio_06_Ponto {
	
	private double x1;
	private double x2;
	private double y1;
	private double y2;
	
	public Exercicio_06_Ponto(double x1, double x2, double y1, double y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	
	public double distancia(double x1, double x2, double y1, double y2) {
		return Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
	}
	
	public String toString() {
		return "A distância entre os pontos: " + String.format("%.2f", distancia(x1, x2, y1, y2));
	}


}

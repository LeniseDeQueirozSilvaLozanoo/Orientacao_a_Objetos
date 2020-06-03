package exercicios_orientacao_a_objetos;

public class Exercicio_09_Temperatura {

	private double temp;

	public Exercicio_09_Temperatura(double temp) {
		this.temp = temp;
		
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}
	
	public double farenheitParaCelsius(double temp) {
		return (5*(temp-32))/9;
	}
	
	public double celsiusParaFarenheit(double temp) {
		return ((9*temp)+32)/5;
	}
	
	public double celsiusParaKelvin (double temp) {
		return temp + 273;
	}
	
	
	public double kelvinParaCelsius (double temp) {
		return temp - 273;
	}
	
	public double farenheitParaKelvin(double temp) {
		return (5/9 * (temp + 459.67));
	}
	
	public double kelvinParaFarenheit(double temp) {
		return ((temp*(9/5))-459.67);
	}
}

package exercicios_orientacao_a_objetos;

public class Exercicio_04_Hora {
	
	private int horas;
	private int minutos;
	private int segundos;
	
	public Exercicio_04_Hora(int horas, int minutos, int segundos) {
		this.horas = validaHoras(horas);
		this.minutos = validaMinutos(minutos);
		this.segundos = validaSegundos(segundos);
	}
	
	public int validaHoras(int horas) {
		if(horas < 0 || horas > 24) {
			return 0;
		} else {return horas;
			}
	}
	
	public int validaMinutos(int minuto) {	
		if(minuto < 0 || minuto > 60){
			return 0;
		} else {return minuto;
			}
	}
	
	public int validaSegundos(int segundo) {
		if(segundo < 0 || segundo > 60){
			return 0;
		} else {return segundo;
			}
	}
	
	public String toString() {
		return "Horário: " + validaHoras(horas) + "h" + validaMinutos(minutos)+ "min" + validaSegundos(segundos);
	}

}

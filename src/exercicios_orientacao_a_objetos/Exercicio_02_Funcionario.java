package exercicios_orientacao_a_objetos;

public class Exercicio_02_Funcionario {

	String nome;
	double salarioBruto;
	double taxa;
	
	public double salarioLiquido() {
		return salarioBruto - taxa;
	}
	
	public void aumentoSalario(double porcentagem) {
		salarioBruto = (salarioBruto + ((porcentagem * salarioBruto)/100));
	}
	
	public String toString() {
		return "Funcion�rio: " + nome + "\nSal�rio L�quido: " + String.format("%.2f", salarioLiquido());
	}
}

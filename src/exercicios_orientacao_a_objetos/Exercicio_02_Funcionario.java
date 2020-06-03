package exercicios_orientacao_a_objetos;

public class Exercicio_02_Funcionario {

	private String nome;
	private double salarioBruto;
	private double taxa;
	
	public Exercicio_02_Funcionario (String nome, double salarioBruto, double taxa) {
		this.nome = nome;
		this.salarioBruto = salarioBruto;
		this.taxa = taxa;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalarioBruto() {
		return salarioBruto;
	}
	
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	
	public double getTaxa() {
		return taxa;
	}
	
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	public double salarioLiquido() {
		return salarioBruto - taxa;
	}
	
	public void aumentoSalario(double porcentagem) {
		salarioBruto = (salarioBruto + ((porcentagem * salarioBruto)/100));
	}
	
	public String toString() {
		return "Funcionário: " + nome + "\nSalário Líquido: " + String.format("%.2f", salarioLiquido());
	}
}

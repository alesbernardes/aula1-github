package enties;

public class Conta {
	
	private int numero;
	private String nome;
	private double saldo;
	
	public Conta(int numero, String nome, double inicialDeposito) {
	
		this.numero = numero;
		this.nome = nome;
		deposito(inicialDeposito);
	}
	
	public Conta(int numero, String nome) {
	
		this.numero = numero;
		this.nome = nome;
	}



	public int getNumero() {
		return numero;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double quantidade) {
		saldo += quantidade;
	}
    public void saque(double quantidade) {
		saldo -= quantidade + 5.0;
	}
	
	public String toString() {
		
		return "conta: "
				+numero
				+ ", nome: "
				+nome
				+ ", Saldo $ "
				+ String.format("%.2f", saldo);
				
				
		
	}
	

}

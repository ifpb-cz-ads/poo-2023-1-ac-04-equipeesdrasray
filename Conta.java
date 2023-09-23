public class Conta {
	//utilizado para atribuir o número da conta
	private static long ordem = 1;

	//dados da conta
	private String nomeTitular;
	private long numero;
	private double saldo;

	public Conta(String nomeTitular){
		this.nomeTitular = nomeTitular;
		this.numero = ordem++;
		this.saldo = 0;
	}

	//getters
	//OBS: Essa classe não possui setters
	public String getTitular(){
		return this.nomeTitular;
	}

	public long getNumero(){
		return this.getNumero();
	}

	public double getSaldo(){
		return this.saldo;
	}

	//métodos especiais
	public boolean sacar(double valor){
		if(saldo >= valor){
			saldo -= valor;
			return true;
		}

		return false;
	}
	
	public boolean depositar(double valor){
		if(valor <= 0)
			return false;

		this.saldo += valor;
		return true;
	}

}
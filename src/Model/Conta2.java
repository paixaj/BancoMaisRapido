package Model;

public class Conta2 {
	
	protected String nome;
	protected String cpf;
	protected int numConta;
	protected float saldo;
	
	public Conta2 (String nome, String cpf, int numConta, float saldo) {
		this.nome 		= nome;
		this.cpf  		= cpf;
		this.numConta 	= numConta;
		this.saldo 		= saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean debitar(double valor) {
		if (valor > saldo) {
			System.out.println("Voce não possui Saldo para o Debito Informado: R$"+valor);
			return false;
		}else {
			this.saldo -= valor;
			System.out.println("Debito de R$"+valor+" Efetuado com Sucesso na Conta: "+numConta);
			return true;
		}
	}
	
	public void creditar(double valor) {
		this.saldo += valor;
		System.out.println("Credito de R$"+valor+ " Efetuado com Sucesso na Conta: "+numConta+"!");
	}
	
	/*public void imprimirInfo() {
		System.out.println("Cliente "+nome +" de CPF: "+cpf+" e Conta: "+numConta+" Seu Saldo é de: R$"+saldo);
	}*/
	
	public String toString() {
		return "CONTA         : " + numConta + " TITULAR: " + nome + " (" + cpf + ")  SALDO R$ " + saldo;
	}
}

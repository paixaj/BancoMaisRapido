package Model;

public class Conta2Especial extends Conta2 {
	private float limite;
	
	public Conta2Especial (String nome, String cpf, int numConta, float saldo, float limite){
		super(nome,cpf,numConta,saldo);
		this.limite=limite;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	public boolean debitar(double valor) {
		if (valor > super.saldo+this.limite) {
			System.out.println("Voce não possui Saldo para o Debito Informado: R$"+valor);
			return false;
		}else {
			super.saldo -= valor;
			System.out.println("Debito de R$"+valor+" Efetuado com Sucesso na Conta: "+numConta);
			return true;
		}
	}
	
	public void creditar(double valor) {
		super.saldo += valor;
		System.out.println("Credito de R$"+valor+ " Efetuado com Sucesso na Conta: "+numConta+"!");
	}
	
	/*public void imprimirInfo() {
		System.out.println("Cliente "+nome +" de CPF: "+cpf+" e Conta: "+numConta+" Seu Saldo é de: R$"+saldo);
	}*/
	
	public String toString() {
		return "CONTA ESPECIAL: " + numConta + " TITULAR: " + nome + " (" + cpf + ")  SALDO R$ " + saldo;
	}
	
}

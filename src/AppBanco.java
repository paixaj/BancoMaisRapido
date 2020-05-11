import java.util.HashMap;
import java.util.Scanner;
import Model.Conta;
public class AppBanco {
	public static void main(String ags[]) {
		HashMap<Integer, Conta> contas;
		Scanner teclado = new Scanner(System.in);
		
		// gerando as contas e adicionando no mapa
		contas = new HashMap<Integer, Conta>();
		
		// gerando varias contas e inserindo no mapa de acordo com 
		// o numero da conta como critério de identificacao
		for (int i = 1; i<= 9 ; i++) {
			Conta c = new Conta("111.222.333-"+i+i, 10000+i, 1000 + (i*100));
			
			contas.put(c.getNumeroConta(), c);
		}
		
		// como fazer para recuperar???
		System.out.println("Digite o numero de conta para recuperar");
		int numero = teclado.nextInt();
		
		Conta consulta = contas.get(numero);
		if (consulta == null) {
			System.out.println("Conta nao existente");
		}
		else {
			System.out.println(consulta.exibirInfo());
		}
	}
}
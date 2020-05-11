import Model.Conta2;
import Model.Conta2Especial;
import java.util.Scanner;

public class AppBanco2 {
	public static void main(String args []) {
		
		/*Conta2 c = new Conta2 ("Adriano", "36494849865", 1001, 1000.0f);
		Conta2Especial ce = new Conta2Especial ("Isidro","111111111111",1002,500.0f,1000.0f);
	
		c.imprimirInfo();
		c.creditar(100);
		c.imprimirInfo();
		c.debitar(1101);
		c.imprimirInfo();
		System.out.println("\n");
		ce.imprimirInfo();
		ce.debitar(1500);
		ce.imprimirInfo();
		ce.imprimirInfo();
		*/
		
		Conta2 c1,c2,c3,c4;
		c1 = new Conta2("Adriano", "1212121212", 1001, 1000.0f);
		c2 = new Conta2Especial ("Isidro","3434343434",1002,500.0f,1000.0f);
		c3 = new Conta2("Bete", "45454545456", 1003, 300.0f);
		c4 = new Conta2Especial ("Lucia","56565656565",1004,800.0f,1000.0f);
		
		
		System.out.println(c1);
		c1.creditar(100);
		System.out.println(c1);
		c1.debitar(1101);
		System.out.println(c1);
		System.out.println("\n");
		System.out.println(c2);
		c2.debitar(1100);
		System.out.println(c2);
		System.out.println("\n");
		System.out.println(c3);
		System.out.println("\n");
		System.out.println(c4);
		
	}
	
}

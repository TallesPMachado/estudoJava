package sintaxeOpcional;

import java.util.Locale;
import java.util.Scanner;

public class exercicioMinutos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int minutes = input.nextInt();
		double conta = 50;
		
		if(minutes > 100) {
			conta += (minutes - 100) * 2;
		}
		System.out.printf("Valor a pagar: R$%.2f", conta);
		
		input.close();

	}

}

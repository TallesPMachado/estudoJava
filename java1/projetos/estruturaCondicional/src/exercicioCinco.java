import java.util.Locale;
import java.util.Scanner;

public class exercicioCinco {

	public static void main(String[] args) {
		
		/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
		seguir, calcule e mostre o valor da conta a pagar.
		
		1 - R$4.00
		2 - R$4.50
		3 - R$5.00
		4 - R$2.00
		5 - R$1.50
		
		*/
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int n1 = input.nextInt(), n2 = input.nextInt();
		double table[] = {4.00, 4.50, 5.00, 2.00, 1.50};		
		
		System.out.printf("Total: $%.2f", table[n1-1] * n2);
		
		input.close();
		
	}
	
}

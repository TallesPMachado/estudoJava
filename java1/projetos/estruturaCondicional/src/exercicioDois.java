import java.util.Locale;
import java.util.Scanner;

public class exercicioDois {

	public static void main(String[] args) {
		// Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		
		if(number == 0) {
			System.out.println("You typed zero");
		} else if(number % 2 == 0) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");
		}
		
		input.close();
		
	}

}

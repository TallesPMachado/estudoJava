import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		/*Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.*/
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		
		if(number == 0) {
			System.out.println("You typed Zero");
		} else if(number < 0) {
			System.out.println("Negative number");
		}else {
			System.out.println("Positive number");
		}
		
		input.close();
		
	}	

}

import java.util.Locale;
import java.util.Scanner;

public class exrecicioSeis {

	public static void main(String[]args) {
		
		/*Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
		seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
		nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.*/
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double read = input.nextDouble();
		
		if(read >= 0 && read <= 25) {
			System.out.println("Intervalo[0, 25]");
		} else if(read > 25 && read <= 50) {
			System.out.println("Intervalo[25, 50]");
		} else if(read > 50 && read <= 100) {
			System.out.println("Intervalo[50, 100]");
		}else {
			System.out.println("Fora de intervalo");
		}
		
		input.close();
		
	}
	
}

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		/*String x;		
		x = input.next();		
		System.out.println("Você digitou: " + x);
		
		int y;		
		y = input.nextInt();
		System.out.println("Você digitou: " + y);
		
		double w;
		w = input.nextDouble();
		System.out.println("Você digitou: " + w);
		
		char sexo;		
		sexo = input.next().charAt(0);
		System.out.println("Você digitou: " + sexo);
		
		System.out.println("Digite tudo de uma vez:");
		x = input.next();
		y = input.nextInt();
		w = input.nextDouble();
		sexo = input.next().charAt(0);
		System.out.println("Você digitou: " + " " + x + " " + y + " " + w + " " + sexo);*/
		
		String s1, s2, s3;
		int x;
		x = input.nextInt();
		input.hasNext();
		s1 = input.nextLine();
		s2 = input.nextLine();
		s3 = input.nextLine();
		System.out.println(x);		
		System.out.println("Dados digitados: " + s1 + " " + s2 + " " + s3);
		
		input.close();
		
	}
	
}

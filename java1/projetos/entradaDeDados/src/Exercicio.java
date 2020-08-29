import java.util.Locale;
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
				
		/*Exercício 1
		int a, b;
		a = input.nextInt();
		b = input.nextInt();
		System.out.println("SOMA = " + (a+b));*/
		
		/*Exercício 2
		double raio = input.nextDouble();
		System.out.printf("A = %.4f", (3.14159 * raio * raio));*/
		
		/*Execício 3
		int a, b, c, d;
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		d = input.nextInt();
		System.out.println("DIFERENCA = " + ((a*b)-(c*d)));*/
		
		/*Exercício 4
		int funcionario = input.nextInt(), ours= input.nextInt();
		double ganho= input.nextDouble();
		System.out.printf("NUMBER = %d\nSALARY = U$%.2f", funcionario, (ganho*ours));*/
		
		/*Execício 5
		int p1 = input.nextInt(), q1 = input.nextInt();
		double v1 = input.nextDouble();
		int p2 = input.nextInt(), q2 = input.nextInt();
		double v2 = input.nextDouble();
		System.out.printf("VALOR A PAGAR: R$%.2f",((v1*q1)+(v2*q2)));*/
		
		/*Exercício 6*/
		double a = input.nextDouble(), b = input.nextDouble(), c = input.nextDouble();
		System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f\n",(a * c / 2.0), (3.14159 *  c  *  c), (( a  +  b ) /  2.0  *  c), (b*b), (a*b));
		
		input.close();
	}
	
}

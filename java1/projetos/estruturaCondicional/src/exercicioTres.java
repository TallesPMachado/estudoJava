import java.util.Locale;
import java.util.Scanner;

public class exercicioTres {

	public static void main(String[] args) {
		/* Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
		Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
		ordem crescente ou decrescente.*/
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt(), b = input.nextInt(), division, bigger, smaller;
		
		if(a > b) {
			bigger = a;
			smaller = b;
		} else {
			bigger = b;
			smaller = a;
		}
		
		division = bigger / smaller;
		
		if(division * smaller == bigger) {
			System.out.println("They are divisible");
		}else {
			System.out.println("They are not divisible");
		}
		
		input.close();

	}

}

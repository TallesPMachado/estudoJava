import java.util.Locale;
import java.util.Scanner;

public class exercicioSete {

	public static void main(String[] args) {
		
		/*Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
		de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
		ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
		Se o ponto estiver na origem, escreva a mensagem “Origem”.
		Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
		situação.*/
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double c1 = input.nextDouble(), c2 = input.nextDouble();
		
		 if(c1 < 0 && c2 < 0) {
			System.out.println("Q3");
		} else if(c1 > 0 && c2 > 0) {
			System.out.println("Q1");
		} else if(c1 > 0 && c2 < 0) {
			System.out.println("Q4");
		} else if(c1 < 0 && c2 > 0) {
			System.out.println("Q2");
		} else {
			System.out.println("Origem");
		}
		
		input.close();
		
	}
	
}

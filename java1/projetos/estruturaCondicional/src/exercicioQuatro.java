import java.util.Locale;
import java.util.Scanner;

public class exercicioQuatro {

	public static void main(String[] agrs) {
		/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
		começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.*/
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		int startTime = input.nextInt(), finalTime = input.nextInt();
		
		if(startTime < finalTime) {
			System.out.printf("Ther game lasted: %d", finalTime - startTime);
		}else {
			System.out.printf("Ther game lasted: %d", (24 - startTime + finalTime));
		}
		
		input.close();
	}
	
}

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int value = input.nextInt();
		String size = (value < 100) ? "below one hundred" : "over one hundred";
		
		System.out.println("The value is: " + size);
		
		input.close();
		
	}

}

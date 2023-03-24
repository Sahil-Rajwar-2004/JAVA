import java.util.*;

public class Switch{
	public static void main(String[] agrs){
		Scanner sc = new Scanner(System.in);
		System.out.print("greeting(1-5): ");
		int change = sc.nextInt();
		switch(change){
			case 1: System.out.println("Hello");
			break;
			case 2: System.out.println("Namaste");
			break;
			case 3: System.out.println("Privet");
			break;
			case 4: System.out.println("Hola");
			break;
			case 5: System.out.println("Bonjour");
			break;
		}
	}
}

import java.util.Scanner;

public class Calc{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		char operator = scan.next().trim().charAt(0);
		int y = scan.nextInt();

		switch(operator){
			case '+':
				System.out.println(x+y);
				break;
			case '-':
				System.out.println(x-y);
				break;
			case '/':
				System.out.println(x/y);
				break;
			case '*':
				System.out.println(x*y);
				break;
			case '%':
				System.out.println(x%y);
				break;
			default:
				System.out.println("Invalid operator ("+operator+")");
		}
	}
}


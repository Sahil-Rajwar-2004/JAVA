import java.util.Scanner;

public class Factorial{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(factorial(num));
	}

	static int factorial(int num){
		if(num>=0){
			if(num == 1 || num == 0){
				return 1;
			}
			return num*factorial(num-1);
		}
		return -1;
	}
}


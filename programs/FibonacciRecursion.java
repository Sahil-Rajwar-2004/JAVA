import java.util.Scanner;

public class FibonacciRecursion{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		int num = read.nextInt();
		System.out.println(fib(num));
	}

	static int fib(int num){
		if(num<2){
			return num;
		}
		return fib(num-1)+fib(num-2);
	}
}

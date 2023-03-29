import java.util.Scanner;

public class SumDigit{
	static int sum_digit(int num){
		if(num == 0){
			return 0;
		}
		return (num%10)+sum_digit(num/10);
	}

	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		int num = read.nextInt();
		System.out.println(sum_digit(num));
	}
}

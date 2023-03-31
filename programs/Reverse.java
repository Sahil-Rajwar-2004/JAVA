import java.util.Scanner;

public class Reverse{
	static int s = 0;
	static void rev(int num){
		if(num == 0){
			return;
		}
		int rem = num % 10;
		s = s * 10 + rem;
		rev(num/10);
	}

	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		int num = read.nextInt();
		rev(num);
		System.out.println(s);
	}
}

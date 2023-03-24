import java.util.Scanner;

public class CountDigits{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		int num = read.nextInt();
		System.out.println(count(num));
	}

	static int count(int num){
		if(num<0){
			num = num*-1;
		}
		return (int)(Math.log10(num))+1;
	}
}


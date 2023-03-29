import java.util.Scanner;

public class NtoOne{
	static void print_reverse(int num){
		if(num == 0){
			return;
		}
		System.out.print(num+" ");
		print_reverse(num-1);
	}


	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		int num = read.nextInt();
		print_reverse(num);
		System.out.println();
	}
}


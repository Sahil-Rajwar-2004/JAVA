import java.util.Scanner;

public class SumOnetoN{
	static int do_sum(int num){
		if(num <= 1){
			return 1;
		}
		return num+do_sum(num-1);
	}

	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		int num = read.nextInt();
		System.out.println(do_sum(num));		
	}
}

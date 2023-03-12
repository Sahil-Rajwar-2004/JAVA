import java.util.Scanner;

public class Armstrong{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		System.out.println(isArmstrong(num));
	}

	static boolean isArmstrong(int num){
		int org = num;
		int sum = 0;
		while(num>0){
			int remainder = num%10;
			num = num/10;
			sum = sum+remainder*remainder*remainder;
		}
		return sum == org;
	}
}


import java.util.Scanner;

public class Prime{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		boolean res = isPrime(num);
		System.out.println(res);
	}

	static boolean isPrime(int n){
		if(n<=1){
			return false;
		}
		int i = 2;
		while(i*i <= n){
			if(n%i==0){
				return false;
			}
			i++;
		}
		return i*i>n;
	}
}


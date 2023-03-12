import java.util.Scanner;

public class MaxWealth{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		int person = read.nextInt();
		int account = read.nextInt();
		int[][] accounts = new int[person][account];
		input(accounts);
		System.out.println(max_wealth(accounts));
	}

	static void input(int[][] array){
		Scanner read = new Scanner(System.in);
		for(int person=0;person<array.length;person++){
			for(int account=0;account<array[person].length;account++){
				array[person][account] = read.nextInt();
			}
		}
	}

	static int max_wealth(int[][] accounts){
		int rich = Integer.MIN_VALUE;
		for(int person = 0;person<accounts.length;person++){
			int sum = 0;
			for(int account = 0;account<accounts[person].length;account++){
				sum += accounts[person][account];
			}
			if(rich<sum){
				rich = sum;
			}
		}
		return rich;
	}
}


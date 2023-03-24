import java.util.Scanner;

public class EvenCountDigits{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		int size = read.nextInt();
		int[] array = new int[size];
		input(array);
		System.out.println(main(array));
	}

	static void input(int[] array){
		Scanner read = new Scanner(System.in);
		for(int i=0;i<array.length;i++){
			array[i] = read.nextInt();
		}
	}

	static int main(int[] array){
		int count = 0;
		for(int item:array){
			if(is_even(item)){
				count++;
			}
		}
		return count;
	}

	static boolean is_even(int num){
		int count_dig = count_digits(num);
		return count_dig%2==0;
	}

	static int count_digits(int num){
		int count = 0;
		while(num>0){
			count++;
			num = num/10;
		}
		return count;
	}
}


import java.util.Scanner;

public class Array{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] array = new int[size];
		for(int i=0;i<size;i++){
			int num = input.nextInt();
			array[i] = num;
		}
		display(array);
	}

	static void display(int[] array){
		for(int num:array){
			System.out.print(num+" ");
		}
		System.out.print("\n");
	}
}


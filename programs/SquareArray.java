import java.util.Scanner;

public class SquareArray{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] array = new int[size];
		input(array);
		squaring(array);
		display(array);
	}

	static void squaring(int[] array){
		for(int i=0;i<array.length;i++){
			array[i] = array[i]*array[i];
		}
	}

	static void input(int[] array){
		Scanner in = new Scanner(System.in);
		for(int i=0;i<array.length;i++){
			int num = in.nextInt();
			array[i] = num;
		}
	}	

	static void display(int[] array){
		for(int num:array){
			System.out.print(num+" ");
		}
		System.out.println("");
	}
}


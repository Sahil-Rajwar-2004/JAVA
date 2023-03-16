import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		int size = read.nextInt();
		int[] array = new int[size];
		input(array);
		bubble_sort(array);
		System.out.println(Arrays.toString(array));
	}

	static void input(int[] array){
		Scanner read = new Scanner(System.in);
		for(int i = 0;i<array.length;i++){
			array[i] = read.nextInt();
		}
	}

	static void bubble_sort(int[] array){
		boolean swapped;
		for(int i = 0;i<array.length;i++){
			swapped = false;
			for(int j = 1;j<array.length-i;j++){
				if(array[j] < array[j-1]){
					int temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
					swapped = true;
				}
			}
			if(!swapped){
				break;
			}
		}
	}
}


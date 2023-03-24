import java.util.Scanner;
import java.util.Arrays;

public class SelectionSort{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		int size = read.nextInt();
		int[] array = new int[size];
		input(array);
		selection_sort(array);
		System.out.println(Arrays.toString(array));
	}

	static void input(int[] array){
		Scanner read = new Scanner(System.in);
		for(int i = 0;i<array.length;i++){
			array[i] = read.nextInt();
		}
	}

	static void selection_sort(int[] array){
		for(int i = 0;i<array.length;i++){
			int last = array.length-i-1;
			int max_index =	get_max_index(array,0,last);
			swap(array,max_index,last);
		}
	}

	static void swap(int[] array,int first,int second){
		int temp = array[first];
		array[first] = array[second];
		array[second] = temp;
	}

	static int get_max_index(int[] array,int start, int end){
		int max = start;
		for(int i = start;i<=end;i++){
			if(array[max]<array[i]){
				max = i;
			}
		}
		return max;
	}
}


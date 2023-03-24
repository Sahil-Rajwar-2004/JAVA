import java.util.Arrays;
import java.util.Scanner;

public class CyclicSort{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		int size = read.nextInt();
		int[] array = new int[size];
		input(array);
		sort(array);
		System.out.println(Arrays.toString(array));
	}

	static void input(int[] array){
		Scanner read = new Scanner(System.in);
		for(int i=0;i<array.length;i++){
			array[i] = read.nextInt();
		}
	}

	static void sort(int[] array){
		int i=0;
		while(i<array.length){
			int loc = array[i] - 1;
			if(array[i]!=array[loc]){
				swap(array,i,loc);
			}else{
				i++;
			}
		}
	}

	static void swap(int[] array,int first,int second){
		int temp = array[first];
		array[first] = array[second];
		array[second] = temp;
	}
}

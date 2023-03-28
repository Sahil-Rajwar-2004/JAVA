import java.util.HashMap;
import java.util.Scanner;

public class RemoveDuplicates{
	static void remove_duplicates(int[] array,int size){
		HashMap<Integer,Boolean> mp = new HashMap<>();
		for(int i = 0;i<size;++i){
			if(mp.get(array[i]) == null){
				System.out.print(array[i]+" ");
				mp.put(array[i],true);
			}
		}
		System.out.println();
	}

	static void input(int[] array){
		Scanner read = new Scanner(System.in);
		for(int i = 0;i<array.length;i++){
			int item = read.nextInt();
			array[i] = item;
		}
	}

	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		int size = read.nextInt();
		int[] array = new int[size];
		input(array);
		remove_duplicates(array,size);
	}
}

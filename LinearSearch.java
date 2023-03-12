import java.util.Scanner;

public class LinearSearch{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] array = new int[size];
		input(array);
		int target = scan.nextInt();
		System.out.println(linear_search(array,target));
	}

	static void input(int[] array){
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<array.length;i++){
			array[i] = scan.nextInt();
		}
	}

	static int linear_search(int[] array,int target){
		for(int i=0;i<array.length;i++){
			if(target == array[i]){
				return i;
			}
		}
		return -1;
	}
}


import java.util.Scanner;

public class BoundedLinearSearch{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		int size = read.nextInt();
		int[] array = new int[size];
		input(array);
		int target = read.nextInt();
		int start = read.nextInt();
		int end = read.nextInt();
		if(start>=0 && end<=array.length){
			System.out.println(linear_search(array,target,start,end));
		}
	}

	static void input(int[] array){
		Scanner read = new Scanner(System.in);
		for(int i=0;i<array.length;i++){
			array[i] = read.nextInt();
		}
	}

	static int linear_search(int[] array,int target,int start,int end){
		for(int i=start;i<=end;i++){
			if(target == array[i]){
				return i;
			}
		}
		return -1;
	}
}



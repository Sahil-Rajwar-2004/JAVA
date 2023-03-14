import java.util.Scanner;

public class CeilingNum{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		int size = read.nextInt();
		int[] array = new int[size];
		input(array);
		int target = read.nextInt();
		System.out.println(ceiling(array,target));
	}

	static void input(int[] array){
		Scanner read = new Scanner(System.in);
		for(int i=0;i<array.length;i++){
			array[i] = read.nextInt();
		}
	}

	static int ceiling(int[] array,int target){
		int start = 0;
		int end = array.length - 1;
		while(start<=end){
			int mid = start + (end - start)/2;
			if(target<array[mid]){
				end = mid - 1;
			}else if(target>array[mid]){
				start = mid + 1;
			}else{
				return mid;
			}
		}
		return start;
	}
}


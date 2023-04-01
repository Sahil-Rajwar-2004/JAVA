import java.util.Scanner;

public class CheckStrictlyIncreasing{
	static boolean check(int array[],int index){
		if(index == array.length-1){
			return true;
		}

		if(array[index] < array[index+1]){
			return check(array,index+1);
		}else{
			return false;
		}
	}
	
	static void input(int[] array){
		Scanner read = new Scanner(System.in);
		for(int i = 0;i<array.length;i++){
			int x = read.nextInt();
			array[i] = x;
		}
	}

	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		int size = read.nextInt();
		int[] array = new int[size];
		input(array);
		System.out.println(check(array,0));
	}
}

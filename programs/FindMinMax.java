import java.util.Scanner;

public class FindMinMax{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		int size = read.nextInt();
		int[] array = new int[size];
		input(array);
		find_min_max(array);
	}
	
	static void input(int[] array){
		Scanner read = new Scanner(System.in);
		for(int i=0;i<array.length;i++){
			array[i] = read.nextInt();
		}
	}
	
	static void find_min_max(int[] array){
		int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
		for(int i=0;i<array.length;i++){
			if(max<array[i]){
				max = array[i];
			}
			if(min>array[i]){
				min = array[i];
			}
		}
		System.out.println(max+" "+min);
	}
}


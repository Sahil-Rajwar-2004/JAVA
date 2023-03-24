import java.util.Scanner;
import java.util.Arrays;

public class LinearSearchMatrix{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		int row = read.nextInt();
		int col = read.nextInt();
		int[][] array = new int[row][col];
		input(array);
		System.out.println(Arrays.deepToString(array));
		int target = read.nextInt();
		linear_search(array,target);
	}

	static void input(int[][] array){
		Scanner read = new Scanner(System.in);
		for(int row = 0;row<array.length;row++){
			for(int col = 0;col<array[row].length;col++){
				array[row][col] = read.nextInt();
			}
		}
	}

	static void linear_search(int[][] array,int target){
		int[] position = {-1,-1};
		for(int row = 0;row<array.length;row++){
			for(int col = 0;col<array[row].length;col++){
				if(target == array[row][col]){
					position[0] = row;
					position[1] = col;
				}
			}
		}
		System.out.println(Arrays.toString(position));
	}
}



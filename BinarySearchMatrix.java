import java.util.Scanner;
import java.util.Arrays;

public class SearchInMatrix{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		int row = read.nextInt();
		int col = read.nextInt();
		int[][] array = new int[row][col];
		input(array);
		int target = read.nextInt();
		System.out.println(Arrays.toString(binary_search(array,target)));
	}

	static void input(int[][] array){
		Scanner read = new Scanner(System.in);
		for(int row = 0;row<array.length;row++){
			for(int col = 0;col<array[row].length;col++){
				array[row][col] = read.nextInt();
			}
		}
	}

	static int[] binary_search(int[][] matrix,int target){
		int row = 0;
		int col = matrix[row].length - 1;
		while(row<matrix.length && col >= 0){
			if(matrix[row][col] == target){
				return new int[]{row,col};
			}
			if(matrix[row][col] < target){
				row++;
			}else{
				col--;
			}
		}
		return new int[]{-1,-1};
	}
}

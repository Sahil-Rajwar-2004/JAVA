import java.util.Scanner;
import java.util.Arrays;

public class Array2D{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int[][] array = new int[2][3];
		for(int row=0;row<array.length;row++){
			for(int col=0;col<array[row].length;col++){
				array[row][col] = in.nextInt();
			}
		}

		for(int row=0;row<array.length;row++){
			for(int col=0;col<array[row].length;col++){
				System.out.print(array[row][col]+" ");
			}
			System.out.println();
		}
	}
}


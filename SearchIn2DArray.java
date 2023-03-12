import java.util.Scanner;

public class SearchIn2DArray{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		int row = read.nextInt();
		int col = read.nextInt();
		int[][] array = new int[row][col];
		input(array,row,col);
		int target = read.nextInt();
		display(array,row,col);
		linear_search(array,target,row,col);
	}

	static void input(int[][] array,int row,int col){
		Scanner read = new Scanner(System.in);
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				array[i][j] = read.nextInt();
			}
		}
	}

	static void display(int[][] array,int row,int col){
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(array[i][j]+" ");
			}System.out.println();
		}
	}

	static void linear_search(int[][] array,int target,int row,int col){
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				if(target == array[i][j]){
					System.out.println(i+" "+j);
				}
			}
		}
	}
}



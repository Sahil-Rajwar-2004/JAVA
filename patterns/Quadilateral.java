import java.util.Scanner;

public class Quadilateral{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		int col = scan.nextInt();
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print("*");
			}System.out.println();
		}
	}
}


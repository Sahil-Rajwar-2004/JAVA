import java.util.Scanner;

public class RightSideRightAngleTri{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		int blank = row-1;
		int count = 1;

		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				for(int k=1;k<=blank;k++){
					System.out.print("");
				}
				for(int l=1;l<=count;l++){
					System.out.print("*");
				}
				count++;
				blank--;
			}
			System.out.println();
		}
	}
}


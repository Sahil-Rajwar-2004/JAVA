import java.util.Scanner;

public class FindLargerNum{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();

		System.out.println(Math.max(z,Math.max(x,y)));
	}
}


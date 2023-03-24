import java.util.Scanner;

public class Functions{
	public static void main(String [] args){
		sum();
	}

	static void	sum(){
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		int total = x+y;
		System.out.println(x+" + "+y+" = "+total);
	}
}


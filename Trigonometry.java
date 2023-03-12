import java.util.Scanner;

public class Trigonometry{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		float angle = scan.nextFloat();
		System.out.println("sin("+angle+") = "+Math.sin(angle));
		System.out.println("cos("+angle+") = "+Math.cos(angle));
		System.out.println("tan("+angle+") = "+Math.tan(angle));
		System.out.println("cosec("+angle+") = "+1/Math.sin(angle));
		System.out.println("sec("+angle+") = "+1/Math.cos(angle));
		System.out.println("cot("+angle+") = "+1/Math.tan(angle));
	}
}


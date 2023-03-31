import java.util.Scanner;

public class RevCharRecursion{
	static void rev(String str, int length){
		if(length == 0){
			System.out.println(str.charAt(length));
			return;
		}
		System.out.print(str.charAt(length));
		rev(str,length-1);
	}

	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		String str = read.nextLine();
		rev(str,str.length()-1);
	}
}

import java.util.Scanner;

public class CaseCheck{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		char chr = scan.next().trim().charAt(0);
		if(chr >= 'a' && chr <= 'z'){
			System.out.println("Lowercase");
		}else{
			System.out.println("Uppercase");
		}
	}
}


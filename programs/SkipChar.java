import java.util.Scanner;

public class SkipChar{
	public static String skip(String input,char target){
		StringBuilder str = new StringBuilder();
		for(int i = 0;i < input.length();i++){
			char c = input.charAt(i);
			if(c != target){
				str.append(c);
			}
		}
		return str.toString();
	}
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		String input = read.nextLine();
		char target = read.nextLine().trim().charAt(0);
		System.out.println(skip(input,target));
	}
}

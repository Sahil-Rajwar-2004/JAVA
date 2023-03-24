import java.util.Scanner;

public class CharLinearSearch{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		String str = read.nextLine();
		char target = read.next().trim().charAt(0);
		System.out.println(linear_search(str,target));
	}

	static boolean linear_search(String str,char target){
		for(char chr:str.toCharArray()){
			if(target == chr){
				return true;
			}
		}
		return false;
	}
}


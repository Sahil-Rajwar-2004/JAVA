import java.util.Scanner;

public class SmallestLetter{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		int size = read.nextInt();
		char[] letters = new char[size];
		input(letters);
		char target = read.next().trim().charAt(0);
		System.out.println(next_greatest_letter(letters,target));
	}

	static void input(char[] letters){
		Scanner read = new Scanner(System.in);
		for(int i=0;i<letters.length;i++){
			letters[i] = read.next().trim().charAt(0);
		}
	}

	static char next_greatest_letter(char[] letters,char target){
		int start = 0;
		int end = letters.length;
		while(start<=end){
			int mid = start + (end - start)/2;
			if(target<letters[mid]){
				end = mid-1;
			}else{
				start = mid+1;
			}
		}
		return letters[start%letters.length];
	}
}


import java.util.*;

public class Loops{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("frequency: ");
		int freq = sc.nextInt();
		// for loop
		for(int i=0;i<freq;i++){
			System.out.println(i);
		}
		// while loop
		int count = 0;
		while(count>freq){
			System.out.println(count);
			count++;
		}
	}
}

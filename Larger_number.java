import java.util.*;

public class Larger_number{
	public static void main(String [] args){
		Scanner	sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		if(x == y){
			System.out.println("Equal");
		}else if(x > y){
			System.out.println("x is gerater than y");
		}else{
			System.out.println("y is greater than x");
		}
	}
}


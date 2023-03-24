import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListExample2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<>(size);

		for(int i=0;i<size;i++){
			list.add(scan.nextInt());
		}

		for(int i=0;i<size;i++){
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
	}
}


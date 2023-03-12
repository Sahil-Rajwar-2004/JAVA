import java.util.ArrayList;

public class ArrayListExample1{
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<>(10);
		list.add(1);
		list.add(2);
		list.add(3);
		//System.out.println(list.contains(3));
		System.out.println(list);
		list.set(0,0); // set(index,newValue) changes the value
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
	}
}

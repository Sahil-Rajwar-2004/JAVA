import java.util.Arrays;

public class VarAgrs{
	public static void main(String[] args){
		func(1,2,3,4,5,6,7,8,9,0);
	}

	static void func(int ...args){
		System.out.println(Arrays.toString(args));
	}
}


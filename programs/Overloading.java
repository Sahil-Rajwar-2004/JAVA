public class Overloading{
	public static void main(String[] args){
		func(7);
		func("Sahil Rajwar");
	}

	static void func(int num){
		System.out.println(num);
	}

	static void func(String name){
		System.out.println(name);
	}
}

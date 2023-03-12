public class MyClass{
	public static void main(String[] args){
		int num = 10;
		float pi = 3.1415f;
		double e = 2.71d;
		String name = "Sahil Rajwar";
		boolean istrue = true;
		System.out.println(((Object)num).getClass().getSimpleName());
		System.out.println(((Object)pi).getClass().getSimpleName());
		System.out.println(((Object)e).getClass().getSimpleName());
		System.out.println(((Object)name).getClass().getSimpleName());
		System.out.println(((Object)istrue).getClass().getSimpleName());
	}
}


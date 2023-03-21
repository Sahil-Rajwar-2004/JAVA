import java.util.Scanner;

public class Sqrt{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		int num = read.nextInt();
		int d = 3;
		System.out.println(sqrt(num,d));
	}

	static double sqrt(int num,int d){
		int start = 0;
		int end = num;
		double root = 0.0;
		while(start<=end){
			int mid = start + (end - start)/2;
			if(mid*mid == num){
				root = mid;
				return mid;
			}

			if(mid*mid > num){
				end = mid - 1;
			}else{
				start = mid + 1;
			}			
		}
		double increment = 0.1;
		for(int i = 0;i<d;i++){
			while(root*root<=num){
				root += increment;
			}
			root -= increment;
			increment /= 10;
		}
		return root;
	}
}

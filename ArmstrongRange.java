public class Armstrong{
	public static void main(String[] args){		
		for(int i=100;i<=1000;i++){
			if(isArmstrong(i)){
				System.out.print(i+" ");
			}
		}
		System.out.println("");
	}

	static boolean isArmstrong(int num){
		int org = num;
		int sum = 0;
		while(num>0){
			int remainder = num%10;
			num = num/10;
			sum = sum+remainder*remainder*remainder;
		}
		return sum == org;
	}
}


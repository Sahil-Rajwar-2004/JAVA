public class Occurence{
	static int first = -1;
	static int last = -1;

	public static void occurence(String str,int index,char element){
		if(index == str.length()){
			System.out.println(first);
			System.out.println(last);
			return;
		}
		char current_char = str.charAt(index);
		if(current_char == element){
			if(first == -1){
				first = index;
			}else{
				last = index;
			}
		}
		occurence(str,index+1,element);
	}

	public static void main(String[] args){
		String str = "abaacdaefaah";
		occurence(str,0,'a');
	}

}

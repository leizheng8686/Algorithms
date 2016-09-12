package Easy;


public class UglyNumber {
	public static boolean isUgly(int num){
		if(num < 1)
			return false;
		if(num == 1)
			return true;
		while(num%2 == 0)
			num = num/2;
		while(num%3 == 0)
			num = num/3;
		while(num%5 == 0)
			num = num/5;
		if(num == 1)
			return true;
		else
			return false;
	}
	public static void main(String arg[]){
		int num = 0 ;
		System.out.println(isUgly(num));
	}
}

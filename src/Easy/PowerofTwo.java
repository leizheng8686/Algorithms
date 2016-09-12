package Easy;


public class PowerofTwo {
	public static boolean isPowerOfTwo(int n) {
		if(n<1)
			return false;
		while(n%2 == 0)
			n = n/2;
		if(n == 1)
			return true;
		else
			return false;
	}
	public static void main(String arg[]){
		int n = 16;
		System.out.println(isPowerOfTwo(n));
	}
}

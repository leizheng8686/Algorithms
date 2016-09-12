package Easy;


public class ReverseInteger {
	public int reverse(int x) {
        int max = 0x7fffffff;
        int min = 0x80000000;
        long res = 0;
        while(x!=0){
            res = res*10+x%10;
            x/=10;
        }
        if(res>max || res<min)
        	return 0;
        else
        	return (int)res;
    }
	public static void main(String[] args){
		ReverseInteger rev = new ReverseInteger();
		System.out.println(rev.reverse(-123));
	}
}

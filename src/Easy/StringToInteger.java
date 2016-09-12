package Easy;


public class StringToInteger {
	public int atoi(String str) {
		if(str.length() < 1)
			return 0;
		str = str.trim();
		double res = 0;
		int i = 0;
		boolean isPositive = true;
		if(str.charAt(i) == '-'){
			i++;
			isPositive = false;
		}else if(str.charAt(i) == '+')
			i++;
		while(i<str.length() && str.charAt(i) <= '9' && str.charAt(i) >= '0'){
			res = res*10 + (str.charAt(i)-'0');
			i++;
		}
		res = isPositive?res:-res;
		if(res > Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
		if(res < Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
		return (int)res;
	}
	
	public static void main(String[] args){
		StringToInteger a = new StringToInteger();
		System.out.println(a.atoi("9223372036854775809"));
	}
}

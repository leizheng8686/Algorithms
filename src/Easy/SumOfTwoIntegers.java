package Easy;

/*
Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.

Example:
Given a = 1 and b = 2, return 3.
 */
public class SumOfTwoIntegers {
	public static int getSum(int a, int b) {
//		int result = 0;
//
//        int tmp = 1;
//        int prev = 0;
//        for(int i = 0;i<32;i++){
//            int tmpA = (a & tmp)>>i;
//            int tmpB = (b & tmp)>>i;
//            int tmpRes = tmpA ^ tmpB ^ prev;
//            prev = (prev & (tmpA ^ tmpB)) ^ (tmpA & tmpB);
//            result |= tmpRes << i;
//            tmp = tmp << 1;
//        }
//        return result;
		
//		while(b != 0)  
//        {  
//            int carry = a & b;  
//            a = a ^ b;  
//            b = carry << 1;  
//        }  
//        return a;  
		
//		if (b == 0) return a;
//        int sum = a ^ b;
//        int carry = (a & b) << 1;
//        return getSum(sum, carry);
		
//		while (b != 0){
//            int x = a ^ b, y = (a & b) << 1;
//            a = x; b = y;
//        }
//        return a;
        
        while(b != 0){
        	int temp = a;
        	a = a ^ b;
        	b = (temp & b) << 1; 
        }
        return a;
    }
	
	public static void main(String args[]){
		System.out.println(getSum(123,5));
	}
}

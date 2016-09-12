package Easy;

/*
Determine whether an integer is a palindrome. Do this without extra space.

Some hints:
Could negative integers be palindromes? (ie, -1)

If you are thinking of converting the integer to string, note the restriction of using extra space.

You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", you know that the reversed integer might overflow. How would you handle such case?

There is a more generic way of solving this problem.
 */
public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if(x < 0)
        	return false;
        int head = 1;
        while(x/head > 9)
        	head *= 10;
        while(x > 0){
        	if(x/head != x%10)
        		return false;
        	x = (x%head)/10;
        	head /= 100;
        }
        return true;
    }
    
    public static void main(String args[]){
    	int n = 82128;
    	System.out.println(isPalindrome(n));
    }
}

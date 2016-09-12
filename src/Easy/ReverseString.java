package Easy;

/*
Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".

 */
public class ReverseString {
	public static String reverseString(String s) {
		int len = s.length();
        char chars[] = new char[len];
        int index = 0;
        for(int i = len-1; i>-1; i--)
        	chars[index++] = s.charAt(i);
        return new String(chars);
    }
	
	public static void main(String args[]){
		String arg = "hello";
		System.out.println(reverseString(arg));
	}
}

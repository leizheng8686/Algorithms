package Easy;

/*
Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:
Given s = "hello", return "holle".

Example 2:
Given s = "leetcode", return "leotcede".

Note:
The vowels does not include the letter "y".
 */
public class ReverseVowelsOfAString {
	public static String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        char v[] = s.toCharArray();
        int left = 0, right = s.length()-1;
        while(left<right){
        	while(left<right&&!vowels.contains(v[left]+""))
        		left++;
        	while(left<right&&!vowels.contains(v[right]+""))
        		right--;
        	if(left < right){
        		char temp = v[left];
        		v[left++] = v[right];
        		v[right--] = temp;
        	}
        }
        return new String(v);
    }
	
	public static void main(String args[]){
		String s = "leetcode";
		System.out.println(reverseVowels(s));
//		assert(reverseVowels(s).equals("leotcede"));
	}
}

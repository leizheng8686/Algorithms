package Easy;

import java.util.HashMap;

// Hashmap O(n2)
//another way: take more space but less time complication O(n)
//www.blog.csdn.net/article/details?id=4550
public class IsomorphicStrings {
	public static boolean isIsomorphic(String s, String t){
		int s_len = s.length();
		int t_len = s.length();
		if(s_len != t_len)
			return false;
		HashMap<Character,Character> maps = new HashMap<Character, Character>();
		for(int i = 0; i<s.length(); i++){
			char sChar = s.charAt(i);
			char tChar = t.charAt(i);
			if(maps.containsKey(sChar) && maps.get(sChar) == tChar)
				continue;
			if(!maps.containsKey(sChar) && !maps.containsValue(tChar))
				maps.put(sChar, tChar);
			else
				return false;
		}
		return true;
	}
	
	public static void main(String args[]){
		String s1 = "egg";
		String s2 = "add";
		System.out.println(isIsomorphic(s1, s2));
	}
}

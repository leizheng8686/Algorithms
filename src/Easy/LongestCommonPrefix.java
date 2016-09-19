package Easy;
/*
Write a function to find the longest common prefix string amongst an array of strings.

 */
public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
        int size = strs.length;
        if(size == 0)
        	return "";
        int minLen = strs[0].length();
        StringBuilder rs = new StringBuilder();
        for(int i = 0; i<size; i++){
        	minLen = minLen<strs[i].length()?minLen:strs[i].length();
        }
        for(int i = 0; i<minLen; i++){
        	char temp = strs[0].charAt(i);
        	for(int j = 0; j<size; j++){
        		if(temp != strs[j].charAt(i)){
        			return rs.toString();
        		}
        	}
        	rs.append(temp);
        }
        return rs.toString();
    }
}

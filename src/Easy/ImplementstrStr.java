package Easy;


public class ImplementstrStr {
	public static int strStr(String haystack, String needle) {
		int n_len = needle.length();
		int h_len = haystack.length();
		if(n_len == 0)
			return 0;
		if(h_len<n_len)
			return -1;
		for(int i=0;i<h_len-n_len+1;i++){
			for(int j=0;j<n_len;j++){
				if(needle.charAt(j) == haystack.charAt(i+j)){
					if(j == n_len-1)
						return i;
				}
				else
					break;
			}
		}
		return -1;
    }
	
	public static void main(String arg[]){
		System.out.println(strStr("aaa", "aa"));
	}
}

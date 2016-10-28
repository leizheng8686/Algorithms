package Easy;
/*
Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.

1~9: {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

10~90: {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};

100~900: {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};

1000~3000: {"M", "MM", "MMM"}.
 */
public class RomantoInteger {
	public int romanToInt(String s) {
        int len = s.length();
        int rs = toInt(s.charAt(len-1));
        for(int i = len-2; i>=0; i--){
        	if(toInt(s.charAt(i)) < toInt(s.charAt(i+1)))
        		rs -= toInt(s.charAt(i));
        	else
        		rs += toInt(s.charAt(i));
        }
        return rs;
    }
	public int toInt(char c){
		switch(c){
		case 'I': return 1;
		case 'V': return 5;  
        case 'X': return 10;  
        case 'L': return 50;  
        case 'C': return 100;  
        case 'D': return 500;  
        case 'M': return 1000;
		}
		return 0;
	}
}

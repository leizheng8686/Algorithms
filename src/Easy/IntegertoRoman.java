package Easy;
/*
Given an integer, convert it to a roman numeral.

Input is guaranteed to be within the range from 1 to 3999.

1~9: {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

10~90: {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};

100~900: {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};

1000~3000: {"M", "MM", "MMM"}.
 */
public class IntegertoRoman {
	public String intToRoman(int num) {
        String d1[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String d2[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};  
        String d3[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String d4[] = {"", "M", "MM", "MMM"};  
        return new String(d4[num/1000] + d3[(num%1000)/100] + d2[(num%100)/10] + d1[num%10]);
    }
}

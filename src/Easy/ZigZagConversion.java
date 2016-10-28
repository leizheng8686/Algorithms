package Easy;
/* 
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:

string convert(string text, int nRows);
convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 */
public class ZigZagConversion {
	public String convert(String s, int numRows) {
		if(numRows<=1)return s;
		char c[] = s.toCharArray();
		int len = c.length;
	    StringBuilder[] sb=new StringBuilder[numRows];
	    for(int i = 0; i<numRows; i++)
	    	sb[i] = new StringBuilder();
	    int i = 0;
	    while(i<len){
	    	for(int j = 0; j<numRows && i<len; j++)
	    		sb[j].append(c[i++]);
	    	for(int j = numRows-2; j>0 && i<len; j--)
	    		sb[j].append(c[i++]);
	    }
	    for(int j = 1; j<numRows; j++)
	    	sb[0] = sb[0].append(sb[j].toString());
	    return sb[0].toString();
    }
}

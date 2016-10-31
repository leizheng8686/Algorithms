package Easy;

import java.util.Stack;

/* 
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
public class ValidParentheses {
	public boolean isValid(String s) {
		if(s.length()%2 == 1)
			return false;
        Stack<Character> st = new Stack<Character>();
        char[] chars = s.toCharArray();
        for(char elem : chars){
        	if(elem == '(')
        		st.push(')');
        	else if(elem == '[')
        		st.push(']');
        	else if(elem == '{')
        		st.push('}');
        	else{
        		if(!st.empty() && st.pop().charValue() == elem)
        			continue;
        		else
        			return false;
        	}
        }
        return st.empty();
    }
}

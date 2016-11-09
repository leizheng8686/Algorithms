package Medium;

import java.util.*;

public class LetterCombinationsOfaPhoneNumber {
	public List<String> letterCombinations(String digits) {
		if(!digits.matches("[1-9]+"))
			return null;
        List<Character> n2 = new ArrayList<Character>();	n2.add('a');n2.add('b');n2.add('c');
        List<Character> n3 = new ArrayList<Character>();	n3.add('d');n3.add('e');n3.add('f');
        List<Character> n4 = new ArrayList<Character>();	n4.add('g');n4.add('h');n4.add('i');
        List<Character> n5 = new ArrayList<Character>();	n5.add('j');n5.add('k');n5.add('l');
        List<Character> n6 = new ArrayList<Character>();	n6.add('m');n6.add('n');n6.add('o');
        List<Character> n7 = new ArrayList<Character>();	n7.add('p');n7.add('q');n7.add('r');n7.add('s');
        List<Character> n8 = new ArrayList<Character>();	n8.add('t');n8.add('u');n8.add('v');
        List<Character> n9 = new ArrayList<Character>();	n9.add('w');n9.add('x');n9.add('y');n9.add('z');
        
        List<String> rs = new ArrayList<String>();
        for(int i = 0; i < digits.length(); i++){
        	int n = (int)(digits.charAt(i));
        	switch(n){
        		case 2:
        	}
        }
    }
}

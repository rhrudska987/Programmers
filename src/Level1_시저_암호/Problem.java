package Level1_시저_암호;

class Solution {
    public String solution(String s, int n) {
    	char[] char_array = s.toCharArray();
    	for(int i=0; i<char_array.length; i++) {
    		int asciiValue = char_array[i];
    		
    		if(asciiValue>64&&asciiValue<91) {
    			asciiValue += n;
    			if(asciiValue>90)
    				asciiValue-=26;
    			char_array[i] = (char)asciiValue;
    		}
    		
    		else if(asciiValue>96&&asciiValue<123) {
    			asciiValue += n;
    			if(asciiValue>122)
    				asciiValue-=26;
    			char_array[i] = (char)asciiValue;
    		}
    		
    		else {
    			char_array[i] = ' ';
    		}
    	}
        String answer = new String(char_array);
        return answer;
    }
}

public class Problem {

	public static void main(String[] args) {
		Solution so = new Solution();
		System.out.println(so.solution("abcdefghijklmnopqrstuvwxyz", 4));
	}
}

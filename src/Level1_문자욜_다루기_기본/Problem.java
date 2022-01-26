package Level1_문자욜_다루기_기본;

class Solution {
    public boolean solution(String s) {
    	char[] arr = s.toCharArray();
    	boolean answer = true;
    	if(arr.length==4||arr.length==6) {
    		for(int i=0; i<arr.length; i++) {
    			int ascii = (int)arr[i];
    			if(ascii<48||ascii>57) {
    				answer = false;
    				break;
    			}
    		}
    	}
    	else answer = false;
        return answer;
    }
}

public class Problem {

	public static void main(String[] args) {
		
	}
}

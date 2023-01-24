package Level2_짝지어_제거하기;

import java.util.Stack;

class Solution {
    public int solution(String s) {
    	char[] ch_arr = s.toCharArray();
    	Stack<Character> stack = new Stack<>();
    	for(int i=0; i<ch_arr.length; i++) {
    		if(stack.size()==0) {
    			stack.add(ch_arr[i]);
    			continue;
    		}
    		char c1 = stack.peek();
    		if(c1==ch_arr[i]) {
    			stack.pop();
    			continue;
    		}
    		else
    			stack.add(ch_arr[i]);
    	}
    	if(stack.size()==0)
    		return 1;
    	else
    		return 0;
    }
}

public class Problem {

	public static void main(String[] args) {
		Solution so = new Solution();
		System.out.println(so.solution("cdcd"));
	}

}

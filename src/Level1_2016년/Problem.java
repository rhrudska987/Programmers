package Level1_2016³â;

import java.util.Calendar;

class Solution {
    public String solution(int a, int b) {
    	Calendar time = Calendar.getInstance();
    	
    	time.set(2016, a-1, b);
    	System.out.println(time.get(Calendar.DAY_OF_WEEK));
    	
        String answer = "";
        return answer;
    }
}


public class Problem {

	public static void main(String[] args) {
		Solution so = new Solution();
		so.solution(5, 24);
	}
}

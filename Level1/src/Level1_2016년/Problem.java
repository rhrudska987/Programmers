package Level1_2016³â;

import java.util.Calendar;

class Solution {
    public String solution(int a, int b) {
    	Calendar time = Calendar.getInstance();
    	
    	time.set(2016, a-1, b);
    	
        String answer = "";
        
        switch(time.get(Calendar.DAY_OF_WEEK)) {
        	case 1:
        		answer = "SUN";
        		break;
        	case 2:
        		answer = "MON";
        		break;
        	case 3:
        		answer = "TUE";
        		break;
        	case 4:
        		answer = "WED";
        		break;
        	case 5:
        		answer = "THU";
        		break;
        	case 6:
        		answer = "FRI";
        		break;
        	case 7:
        		answer = "SAT";
        		break;
        }
        return answer;
    }
}


public class Problem {

	public static void main(String[] args) {
		Solution so = new Solution();
		so.solution(5, 24);
	}
}

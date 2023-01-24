package Level1_정수_내림차순으로_배치하기;

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public long solution(long n) {
    	ArrayList<Integer> list = new ArrayList<>();
    	int length = (int)(Math.log10(n)+1);
    	while(true) {
    		if(list.size()==length)
    			break;
    		list.add((int)(n%10));
    		n /= 10;
    	}
    	Collections.sort(list, Collections.reverseOrder());
    	
        long answer = 0;
        for(int i=0; i<list.size(); i++) 
        	answer += list.get(i)*Math.pow(10, list.size()-i-1);
        return answer;
    }
}

public class Problem {

	public static void main(String[] args) {
		Solution so = new Solution();
		so.solution(118372);
	}

}

package Level1_최소직사각형;

import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int[][] sizes) {
    	Integer[] big = new Integer[sizes.length];
    	Integer[] small = new Integer[sizes.length];
    	
    	for(int i=0; i<sizes.length; i++) {
    		if(sizes[i][0]>=sizes[i][1]) {
    			big[i] = sizes[i][0];
    			small[i] = sizes[i][1];
    		}
    		else {
    			big[i] = sizes[i][1];
    			small[i] = sizes[i][0];
    		}
    	}
    	
    	Arrays.sort(big, Collections.reverseOrder());
    	Arrays.sort(small,Collections.reverseOrder());
    	
        int answer = big[0]*small[0];
        return answer;
    }
}

public class Problem {

	public static void main(String[] args) {
		Solution so = new Solution();
		int[][] arr = {{60,50},{30,70},{60,30},{80,40}};
		System.out.println(so.solution(arr));
	}
}

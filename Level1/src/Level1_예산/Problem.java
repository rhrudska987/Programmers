package Level1_¿¹»ê;

import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for(int i=0; i<d.length; i++) {
        	if(budget-d[i]<0) break;
        	else {
        		answer++;
        		budget -= d[i];
        	}
        }
        return answer;
    }
}

public class Problem {

	public static void main(String[] args) {
		Solution so  = new Solution();
		int[] arr = {2,2,3,3};
		System.out.println(so.solution(arr, 10));
		
	}
}

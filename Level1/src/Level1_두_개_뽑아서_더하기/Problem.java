package Level1_두_개_뽑아서_더하기;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

class Solution {
    public int[] solution(int[] numbers) {
    	HashSet<Integer> set = new HashSet<>();
    	
    	for(int i=0; i<numbers.length-1; i++) {
    		for(int j=i+1; j<numbers.length; j++) {
    			set.add(numbers[i]+numbers[j]);
    		}
    	}
    	
        int[] answer = new int[set.size()];
        
        Iterator<Integer> it = set.iterator();
        int i=0;
        while(it.hasNext()) {
        	answer[i++] = it.next();
        }
        Arrays.sort(answer);
        return answer;
    }
}

public class Problem {

	public static void main(String[] args) {
		int[] numbers = {5,0,2,7};
		Solution so = new Solution();
		so.solution(numbers);
	}

}

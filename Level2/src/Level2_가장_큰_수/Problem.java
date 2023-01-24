package Level2_가장_큰_수;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(int[] numbers) {
    	Integer numbers_Integer[] = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
    	Arrays.sort(numbers_Integer, new Comparator<Integer>() {
    		@Override
    		public int compare(Integer first, Integer second) {
    			String s1 = String.valueOf(first) + String.valueOf(second);
    			String s2 = String.valueOf(second) + String.valueOf(first);
    			return s2.compareTo(s1);
    		}
    	});
    	String answer = "";
    	for(int i=0; i<numbers_Integer.length;i++) 
    		answer += String.valueOf(numbers_Integer[i]);
    	
    	int sum = 0;
    	for(int i:numbers) sum += i;
    	if(sum==0) return "0";
    			    	
    	return answer;
    }
}

public class Problem {

	public static void main(String[] args) { 
		int numbers[] = {979,97,978,81,818,817};
		Solution so = new Solution();
		System.out.println(so.solution(numbers));			
	}

}

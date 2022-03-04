package Level2_«¡∏∞≈Õ;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] priorities, int location) {
    	String[] priorities_copy = new String[priorities.length];
    	for(int i = 0; i<priorities.length; i++) {
    		if(i==location)
    			priorities_copy[i] = String.valueOf(priorities[i])+"*";
    		else
    			priorities_copy[i] = String.valueOf(priorities[i]);
    	}
    	
    	Queue<Integer> queue = new LinkedList<>();
    	Queue<String> queue_copy = new LinkedList<>();
    	for(int i=0; i<priorities.length; i++) { 
    		queue.offer(priorities[i]);
    		queue_copy.offer(priorities_copy[i]);
    	}
    	
    	int answer = 1;
    	while(queue.size()!=0) {
    		int max = Collections.max(queue);
    		int num = queue.poll();
    		String num_copy = queue_copy.poll();
    		if(num == max && num_copy.contains("*")) {
    			return answer;
    		}
    		else if(num == max) {
    			answer++;
    		}
    		else{
    			queue.offer(num);
    			queue_copy.offer(num_copy);
    		}
    	}
        return answer;
    }
}

public class Problem {

	public static void main(String[] args) {
		Solution so = new Solution();
		int[] priorities = {1,1,9,1,1,1};
		System.out.println(so.solution(priorities, 0));
		
	}

}

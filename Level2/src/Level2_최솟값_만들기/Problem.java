package Level2_최솟값_만들기;

import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int solution(int []A, int []B) {
    	PriorityQueue<Integer> ascending = new PriorityQueue<>();
    	for(int a : A)
    		ascending.add(a);
    	
    	PriorityQueue<Integer> decending = new PriorityQueue<>(Collections.reverseOrder());
    	for(int b : B)
    		decending.add(b);
    	
        int sum = 0;
        while(ascending.size()>0) 
        	sum += ascending.poll()*decending.poll();
        
        return sum;
    }
}

public class Problem {
	
	public static void main(String[] args) {
		int[] a = {1,4,2};
		int[] b = {5,4,4};
		Solution so = new Solution();
		System.out.println(so.solution(a, b));
	}
	
}

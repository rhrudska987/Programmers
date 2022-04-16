package Level2_´õ_¸Ê°Ô;

import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int k) {
    	PriorityQueue<Integer> heap = new PriorityQueue<>();
    	for(int i : scoville)
    		heap.add(i);
    	
    	int times = 0;
    	while(true) {
    		if(heap.size()==1&&heap.peek()<k)
    			return -1;
    		else {
    			int first_low = heap.poll();
    			if(first_low<k) {
    				int second_low = heap.poll();
    				heap.add(first_low + second_low*2);
    				times++;
    			}
    			else 
    				return times;
    		}
    	}
    }
}

public class Problem {

	public static void main(String[] args) {
		int[] scoville = {1,2,3,9,10,12};
		Solution so = new Solution();
		System.out.println(so.solution(scoville, 7));
	}

}

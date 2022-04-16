package Level2_ÃÖ´ñ°ª°ú_ÃÖ¼Ú°ª;

import java.util.PriorityQueue;

class Solution {
    public String solution(String s) {
    	String[] s_arr = s.split(" ");
    	int[] arr = new int[s_arr.length];
    	for(int i=0; i<s_arr.length; i++)
    		arr[i] = Integer.parseInt(s_arr[i]);
    	
    	PriorityQueue<Integer> heap = new PriorityQueue<>();
    	for(int i : arr)
    		heap.add(i);
    	
    	
    	int min = heap.poll();
    	while(heap.size()>1)
    		heap.poll();
    	int max = heap.poll();
    	String answer = min + " " + max;
        return answer;
    }
}

public class Problem {

	public static void main(String[] args) {
		Solution so = new Solution();
		System.out.println(so.solution("1 2 3 4"));
	}

}

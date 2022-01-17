package Level1_같은_숫자는_싫어;

import java.util.ArrayList;

class Solution {
    public int[] solution(int []arr) {
    	ArrayList<Integer> list = new ArrayList<>();
    	for(int i=0; i<arr.length-1; i++) {
    		if(arr[i] != arr[i+1])
    			list.add(arr[i]);
    	}
    	list.add(arr[arr.length-1]);
    	
    	int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}

public class Problem {
	
	public static void main(String[] args) {
		Solution so = new Solution();
		int[] arr = {4,4,4,3,3};
		so.solution(arr);
	}
}

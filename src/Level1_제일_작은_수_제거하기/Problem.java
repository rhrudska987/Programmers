package Level1_제일_작은_수_제거하기;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
    	int[] answer;
    	int[] arr_copy = arr.clone();
    	if(arr.length==1) {
    		answer = new int[1];
    		answer[0] = -1;
    		return answer;
    	}

        Arrays.sort(arr_copy);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<arr.length; i++)
        	list.add(arr_copy[i]);
        
        int count = 0;
        answer = new int[arr.length-1];
        for(int i=0; i<arr.length; i++) {
        	boolean check = false;
        	for(int j=0; j<list.size(); j++) {
        		if(arr[i]==list.get(j)) {
        			check = true;
        			break;
        		}
        	}
        	if(check) 
    			answer[count++] = arr[i];
        }
        return answer;
    }
}

public class Problem {

	public static void main(String[] args) {
		Solution so = new Solution();
		int[] arr = {4,3,2,1};
		so.solution(arr);
	}
}

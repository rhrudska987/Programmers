package Leve1_나누어_떨어지는_숫자_배열;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
    	/*ArrayList<Integer> list = new ArrayList<>();
    	for(int i=0;i<arr.length; i++) {
    		if(arr[i]%divisor==0)
    			list.add(arr[i]);
    	}
    	int[] answer;
    	if(list.size()==0) {
    		answer = new int[1];
    		answer[0] = -1;
    	}
    	else {
    		answer = list.stream().mapToInt(i->i).toArray();
    	}
    	Arrays.sort(answer);
        return answer;*/
    	return Arrays.stream(arr).filter(i->i%divisor==0).toArray();
    }
}

public class Problem {
	
	public static void main(String[] args) {
		Solution so = new Solution();
		int[] arr = {5,9,15,10};
		System.out.println( Arrays.toString( so.solution(arr, 5) ));
	}
}

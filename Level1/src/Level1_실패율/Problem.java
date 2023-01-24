package Level1_실패율;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int N, int[] stages) {
    	ArrayList<Double> list = new ArrayList<>();
    	Arrays.sort(stages);
    	
    	double denominator = stages.length;//분모
    	int count = 0;
    	
    	for(int i=1; i<=N; i++) {
    		double numerator = 0;//분자
    		if(denominator==0) {//나머지 단계 실패율 0으로 채우기
    			for(int k=0; k<=N-i; k++) {
    				list.add(0.0);
    			}
    			break;
    		}
    		for(int j=count; j<stages.length; j++) {
    			if(i==stages[j]) {
    				numerator++;
    				count++;
    			}
    		}
    		double num = numerator/denominator;
    		list.add(num);
    		denominator -= numerator;
    	}
    	
        int[] answer = new int[N];
        int k=0;
        
        while(k<N) {
        	double max = Collections.max(list);
        	for(int j=0; j<list.size(); j++) {
        		if(max==list.get(j)) {
        			answer[k++] = j+1;
        			list.set(j, -1.0);
        		}
        	}
        }
        
        return answer;
    }
}

public class Problem {
	 public static void main(String[] args) {
		int stages[] = {2,2,2,2,2};
		Solution so = new Solution();
		so.solution(5, stages);
	 }
}

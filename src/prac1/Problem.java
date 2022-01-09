package prac1;

import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] supo1 = {1,2,3,4,5};
        int[] supo2 = {2,1,2,3,2,4,2,5};
        int[] supo3 = {3,3,1,1,2,2,4,4,5,5};
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(0);
        list.add(0);
        
        for(int i = 0; i<answers.length; i++) {
        	if(answers[i] == supo1[i%5]) list.set(0, list.get(0)+1);
        	if(answers[i] == supo2[i%8]) list.set(1, list.get(1)+1);
        	if(answers[i] == supo3[i%10]) list.set(2, list.get(2)+1);
        }
        
    	int max = 0;
        for(int i=0; i<list.size(); i++) {
        	if(max<list.get(i)) max = list.get(i);
        }
        
    	ArrayList<Integer> listAnswer = new ArrayList<>();
    	for(int i=0; i<list.size();i++) {
    		if(max == list.get(i)) listAnswer.add(i+1);
    	}
    	
    	int[] answer = new int[listAnswer.size()];
    	
    	for(int i=0; i<answer.length; i++) {
    		answer[i] = listAnswer.get(i).intValue();
    	}
    	for(int i=0; i<answer.length; i++) {
    		System.out.println(answer[i]);
    	}
        return answer;
        
    }
}

public class Problem {
	 public static void main(String[] args) {
		int[] answer = {5,4,4,2,1};
		Solution so = new Solution();
		so.solution(answer);
		//System.out.println(so.solution(answer).toString());
		 
	 }
}

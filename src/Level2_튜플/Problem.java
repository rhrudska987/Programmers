package Level2_Æ©ÇÃ;

import java.util.ArrayList;
import java.util.List;


class Solution {
    public int[] solution(String s) {
    	String line = s.substring(1, s.length()-1);
    	List<String> setList = new ArrayList<>();
    	int first = 0;
    	int end = 0;
    	while(first < line.length()) {
    		if(line.charAt(end)=='}') {
    			String set = line.substring(++first, end++);
    			first = ++end;
    			setList.add(set);
    		}
    		else
    			end++;
    	}
    	ArrayList<String> answerList = new ArrayList<>();
    	while(setList.size()!=0) {
    		int minLength = setList.get(0).length();
    		int minIndex = 0;
    		for(int i=1; i<setList.size(); i++) {
    			if(setList.get(i).length()<minLength) {
    				minLength = setList.get(i).length();
    				minIndex = i;
    			}
    		}
    		String[] s_arr = setList.get(minIndex).split(",");
    		for(int i=0; i<s_arr.length; i++) {
    			boolean check = true;
    			if(answerList.size()==0) {
    				answerList.add(s_arr[0]);
    				break;
    			}
    			for(int j=0; j<answerList.size(); j++) {
    				if(answerList.get(j).equals(s_arr[i])) {
    					check = false;
    					break;
    				}
    			}
    			if(check) {
    				answerList.add(s_arr[i]);
    				break;
    			}
    		}
    		setList.remove(minIndex);
    	}
    	
    	int[] answer = new int[answerList.size()];
    	for(int i=0; i<answerList.size(); i++)
    		answer[i] = Integer.parseInt(answerList.get(i));    	
        return answer;
    }
}

public class Problem {

	public static void main(String[] args) {
		Solution so = new Solution();
		so.solution("{{1,2,3},{2,1},{1,2,4,3},{2}}");
	}
}

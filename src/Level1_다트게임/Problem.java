package Level1_다트게임;

import java.util.ArrayList;

class Solution {
    public int solution(String dartResult) {
    	ArrayList<Integer> list = new ArrayList<>();
    	String[] sarr = dartResult.split("");
    	String line = "";
    	for(int i=0; i<sarr.length; i++) {
    		switch(sarr[i]) {
    			case "S":
    				list.add(Integer.parseInt(line));
    				line = "";
    				break;
    			case "D":
    				list.add((int)Math.pow(Integer.parseInt(line),2));
    				line = "";
    				break;
    			case "T":
    				list.add((int)Math.pow(Integer.parseInt(line),3));
    				line = "";
    				break;
    			case "*":
    				if(list.size()==1) {
    					list.set(0, list.get(0)*2);
    				}
    				else {
    					list.set(list.size()-1, list.get(list.size()-1)*2);
    					list.set(list.size()-2, list.get(list.size()-2)*2);
    				}
    				break;
    			case "#":
    				list.set(list.size()-1, list.get(list.size()-1)*-1);
    				break;
    			default:
    				line += sarr[i];
    		}
    	}
    	int answer = 0;
    	for(int i=0; i<list.size(); i++) {
    		answer += list.get(i);
    	}
        return answer;
    }
}


public class Problem {

	public static void main(String[] args) {
		String n = "1D2S#10S";
		Solution so = new Solution();
		so.solution(n);
	}
}

package Level2_H_Index;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
    	int duplication = 0;
    	while(true) {
    		duplication = 0;
    		for(int j=0; j<citations.length; j++) {
    			if(citations[j]>=answer)
   					duplication++;
   			}
   			if(duplication>=answer&&(citations.length-duplication)<=answer)
   				answer++;
   			else
   				break;
    	}
    	
        return --answer;
    }
}

public class Problem {

	public static void main(String[] args) {
		Solution so = new Solution();
		int[] a = {3,0,6,1,5};
		System.out.println(so.solution(a));
	}
}

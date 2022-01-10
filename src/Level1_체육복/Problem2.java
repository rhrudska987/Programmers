package Level1_ü����;

import java.util.ArrayList;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) { 	
    	ArrayList<Integer> gymUniformList = new ArrayList<>();
    	
    	for(int i=0; i<n; i++) { //�� �л��� ü���� ���� üũ 
    		gymUniformList.add(1);
    		
    		for(int j=0; j<lost.length; j++) {//ü�������� ���� üũ
    			if((i+1)==lost[j]) {
    				gymUniformList.set(i, 0);
    				break;
    			}
    		}
    		
    		for(int k=0; k<reserve.length; k++) {//����ü���� ���� üũ
    			if((i+1)==reserve[k]) {
    				gymUniformList.set(i, gymUniformList.get(i)+1);
    				break;
    			}
    		}
    	}
    	
    	for(int i=0; i<gymUniformList.size()-1; i++) {
    		if(gymUniformList.get(i)==2&&gymUniformList.get(i+1)==0) {
    			gymUniformList.set(i, 1);
    			gymUniformList.set(i+1, 1);
    		}
    		else if(gymUniformList.get(i)==0&&gymUniformList.get(i+1)==2) {
    			gymUniformList.set(i, 1);
    			gymUniformList.set(i+1, 1);
    		}
    		
    	}
    	
    	int answer = 0;
    	for(int i=0; i<gymUniformList.size(); i++) {
    		if(gymUniformList.get(i)!=0) answer++;
    	}
    	
        return answer;
    }
}
public class Problem2 {
	 public static void main(String[] args) {
		 int n = 10;
		 int[] lost = {3,9,10};
		 int[] reserve = {3,8,9};
		 
		 Solution so = new Solution();
		 System.out.println(so.solution(n, lost, reserve));
	 }
}
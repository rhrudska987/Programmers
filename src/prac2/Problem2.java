package prac2;

import java.util.ArrayList;

class Solution {
	public int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer[]> list2 = new ArrayList<>();
        for(int i=0; i<nums.length-2; i++) {//3개의 숫자 리스트에 집어넣기
        	for(int j=i+1; j<nums.length-1; j++) {
        		for(int k=j+1; k<nums.length; k++) {
        			list2.add(new Integer[] {nums[i], nums[j], nums[k]});
        		}
        	}
        }
        
        for(int i=0; i<list2.size(); i++) {
        	int sum = list2.get(i)[0] + list2.get(i)[1] + list2.get(i)[2];    
        	boolean isPrime = true;
        	for(int j = 2; j<=Math.sqrt(sum); j++) {//소수판별
        		if(sum%j==0) {
        			isPrime = false;
        			break;
        		}
        	}
       		if(isPrime) {
       			answer++;
       			System.out.println("[" + list2.get(i)[0] + "," + list2.get(i)[1] + "," + list2.get(i)[2]
       					+"]를 이용해서 " + sum + "을 만들 수 있습니다.");
       		}
        }
        return answer;
    }
}

public class Problem2 {
	 public static void main(String[] args) {
	    	int num[] = {1,2,7, 6, 4};
	    	Solution so = new Solution();
	    	so.solution(num);
	    }
}

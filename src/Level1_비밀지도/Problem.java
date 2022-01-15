package Level1_비밀지도;

import java.util.ArrayList;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
    	String[] answer = new String[n];
    	for(int i=0; i<n; i++) {
    		String a1 = Integer.toBinaryString(arr1[i]);//10진수->2진수
    		String a2 = Integer.toBinaryString(arr2[i]);
    		String[] sarr1 = a1.split("");
    		String[] sarr2 = a2.split("");
    		ArrayList<String> list1 = new ArrayList<>();
    		ArrayList<String> list2 = new ArrayList<>();
    		for(String temp:sarr1) list1.add(temp);
    		for(String temp:sarr2) list2.add(temp);
    		while(list1.size()<n) list1.add(0, "0");
    		while(list2.size()<n) list2.add(0, "0");
    		StringBuilder sb = new StringBuilder("");
    		for(int j=0; j<n; j++) {
    			if(list1.get(j).equals("0")&&list2.get(j).equals("0")) sb.append(" ");
    			else sb.append("#");
    		}
    		answer[i] = sb.toString();
    	}
        return answer;
    }
}

public class Problem {

	public static void main(String[] args) {
		int arr1[] = {46,33,33,22,31,50};
		int arr2[] = {27,56,19,14,14,10};
		Solution so = new Solution();
		so.solution(6, arr1, arr2);
		
		String a = Integer.toBinaryString(20|1);
		
		System.out.println(a);
	}
}
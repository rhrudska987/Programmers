package prac1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
	public int[] solution(int[] array, int[][] commands) {		
		List<Integer> answerList = new ArrayList<>();
		
		for(int i=0; i<commands.length; i++) {
			List<Integer> arrList = new ArrayList<>();
			for(int j=0; j<array.length; j++) {
				arrList.add(array[j]);
			}
			List<Integer> list = arrList.subList(commands[i][0]-1, commands[i][1]);
			Collections.sort(list);
			answerList.add(list.get(commands[i][2]-1));	
		}
			
        int[] answer = answerList.stream().mapToInt(i->i).toArray();
        return answer;
    }
}

public class Problem {
	 public static void main(String[] args) {
		 int[] arr = {1,5,2,6,3,7,4};
		 int [][] commands = {{2,5,3}, {4,4,1},{1,7,3}};
		 Solution so = new Solution();
		 System.out.println(so.solution(arr, commands));
		
		 
	 }
}

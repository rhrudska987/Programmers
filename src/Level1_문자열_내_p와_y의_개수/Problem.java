package Level1_문자열_내_p와_y의_개수;

class Solution {
    boolean solution(String s) {
        String[] arr = s.split("");
        int numberOfP = 0;
        int numberOfY = 0;
        
        for(int i=0; i<arr.length; i++) {
        	if(arr[i].equals("p")||arr[i].equals("P"))
        		numberOfP++;
        	else if(arr[i].equals("y")||arr[i].equals("Y"))
        		numberOfY++;
        }
        boolean answer;
        if(numberOfP==numberOfY)
        	answer = true;
        else
        	answer = false;
        return answer;
    }
}

public class Problem {

	public static void main(String[] args) {
		
	}

}

package Level1_Æò±Õ_±¸ÇÏ±â;

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for(int i=0; i<arr.length; i++)
        	answer += arr[i];
        return answer/arr.length;
    }
}

public class Problem {

	public static void main(String[] args) {
		Solution so = new Solution();
		int[] arr = {1,2,3,4};
		so.solution(arr);
	}
}

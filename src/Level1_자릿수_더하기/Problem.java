package Level1_자릿수_더하기;

class Solution {
    public int solution(int n) {
        String s = Integer.toString(n);
        String[] arr = s.split("");
        int answer = 0;
        for(int i=0; i<arr.length; i++) 
        	answer += Integer.parseInt(arr[i]);
        return answer;
    }
}

public class Problem {

	public static void main(String[] args) {
		Solution so = new Solution();
		System.out.println(so.solution(987));
	}
}

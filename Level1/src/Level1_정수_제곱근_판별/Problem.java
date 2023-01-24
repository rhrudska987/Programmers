package Level1_정수_제곱근_판별;

class Solution {
    public long solution(long n) {
    	if(n%Math.sqrt(n)==0) 
    		return (long)Math.pow(Math.sqrt(n)+1, 2);
    	else 
    		return -1;
    }
}

public class Problem {
	public static void main(String[] args) {
		Solution so = new Solution();
		so.solution(3);
	}
}

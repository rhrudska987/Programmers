package Level1_x만큼_간격이_있는_n개의_숫자;

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i=0; i<n;)
        	answer[i] = (long)x*++i;
        return answer;
    }
}

public class Problem {

	public static void main(String[] args) {
		
	}
}

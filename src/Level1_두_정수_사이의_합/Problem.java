package Level1_두_정수_사이의_합;

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        for(int i=min; i<=max; i++)
        	answer+=i;
        return (int)answer;
    }
}

public class Problem {

	public static void main(String[] args) {
		
	}
}

package Level1_소수_찾기;

class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=2; i<=n; i++) {
        	boolean check = true;
        	for(int j=2; j<=Math.sqrt(i); j++) {
        		if(i%j==0) {
        			check = false;
        			break;
        		}
        	}
        	if(check) answer++;        	
        }
        return answer;
    }
}

public class Problem {

	public static void main(String[] args) {
		Solution so = new Solution();
		System.out.println(so.solution(10));
		System.out.println(so.solution(5));
	}
}

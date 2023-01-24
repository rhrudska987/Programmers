package Level1_약수의_합;

class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n/2; i++) {
        	if(n%i==0)
        		answer += i;
        }
        return answer+n;
    }
}

public class Problem {

	public static void main(String[] args) {
		Solution so = new Solution();
		System.out.println(so.solution(12));
	}

}

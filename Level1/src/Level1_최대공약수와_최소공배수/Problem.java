package Level1_최대공약수와_최소공배수;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int smallNumber = (n<=m)? n : m;
        int bigNumber = (n>=m)? n : m;
        for(int i=1; i<=smallNumber; i++) {
        	if(n%i==0&&m%i==0)
        		answer[0] = i;
        }
        
        for(int i=smallNumber; i>=1; i--) {
        	int GCD = bigNumber*i;
        	if(GCD%n==0&&GCD%m==0)
        		answer[1] = GCD;
        }
        
        return answer;
    }
}

public class Problem {

	public static void main(String[] args) {
		Solution so = new Solution();
		so.solution(3, 12);
	}
}

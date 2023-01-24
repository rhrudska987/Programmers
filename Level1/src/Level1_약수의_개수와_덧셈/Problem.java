package Level1_�����_������_����;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left; i<=right; i++) {
        	int numberOfDivisor = 0;
        	for(int j=1; j<=i; j++) {
        		if(i%j==0) numberOfDivisor++;
        	}
        	if(numberOfDivisor%2==0) answer += i;
        	else answer -= i;
        }
        return answer;
    }
}

public class Problem {

	public static void main(String[] args) {
		Solution so = new Solution();
		System.out.println(so.solution(24, 27));
	}

}

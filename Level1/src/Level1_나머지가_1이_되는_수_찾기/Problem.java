package Level1_��������_1��_�Ǵ�_��_ã��;

class Solution {
    public int solution(int n) {
    	int answer = 0;
    	for(int i=2; i<n; i++) {
        	if((n-1)%i==0) {
        		answer = i;
        		break;
        	}
        }
        return answer;
    }
}

public class Problem {

	public static void main(String[] args) {
		Solution so = new Solution();
		System.out.println(so.solution(10));
	}
}

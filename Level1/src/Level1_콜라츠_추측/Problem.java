package Level1_ÄÝ¶óÃ÷_ÃßÃø;

class Solution {
    public int solution(long num) {
        int answer = 0;
        long value = num;
        while(answer!=-1) {
        	if(value==1)
        		break;
        	value = (value%2==0)? value/(long)2 : value*(long)3+(long)1;
        	answer++;
        	if(answer==500)
        		answer = -1;
        	
        }
        return answer;
    }
}

public class Problem {

	public static void main(String[] args) {
		Solution so = new Solution();
		so.solution(1);
	}
}

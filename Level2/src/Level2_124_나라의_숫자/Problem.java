package Level2_124_나라의_숫자;

class Solution {
    public String solution(int n) {
        String answer = "";
        while(n>0) {
        	int share = n/3;
        	int rest = n%3;
        	switch(rest) {
        		case 0:
        			share -= 1;
        			answer = "4" + answer;
        			break;
        		case 1:
        			answer = "1" + answer;
        			break;
        		case 2:
        			answer = "2" + answer;
        			break;
        	}
        	n = share;
        }
        return answer;
    }
}

public class Problem {

	public static void main(String[] args) {
		Solution so  = new Solution();
		System.out.println(so.solution(13));
	}

}

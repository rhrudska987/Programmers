package Level1_���ڼ��ڼ��ڼ��ڼ��ڼ�;

class Solution {
    public String solution(int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=n; i++) {
        	if(i%2==1)
        		sb.append("��");
        	else
        		sb.append("��");
        }
        answer = sb.toString();
        return answer;
    }
}

public class Problem {

	public static void main(String[] args) {
		Solution so = new Solution();
		System.out.println(so.solution(3));
	}
}

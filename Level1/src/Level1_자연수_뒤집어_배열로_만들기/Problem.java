package Level1_�ڿ���_������_�迭��_�����;

class Solution {
    public int[] solution(long n) {
        int[] answer = new int[(int)(Math.log10(n)+1)];
        int i=0;
        while(true) {
        	if(i==answer.length)
        		break;
        	answer[i++] = (int)(n%10);
        	n /= 10;
        	System.out.println(answer[i-1]);
        }
        System.out.println("��");
        return answer;
    }
}

public class Problem {

	public static void main(String[] args) {
		Solution so = new Solution();
		long n = 10000000000L;
		so.solution(n);
	}
}

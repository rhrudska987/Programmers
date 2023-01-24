package Level1_3����_������;

class Solution {
    public int solution(int n) {
        int answer = 0;
        String ans = "";
        
        while(n!=0) {
        	ans += n%3;
        	n/=3;
        }        
        
        String[] sr = ans.split("");
        
        for(int i=0; i<sr.length; i++) {
        	answer += Integer.parseInt(sr[i])*(Math.pow(3, sr.length-i-1));
        }
        
        return answer;
    }
}

public class Problem {
	
	public static void main(String[] args) {
		Solution so = new Solution();
		System.out.println(so.solution(45));
	}
}

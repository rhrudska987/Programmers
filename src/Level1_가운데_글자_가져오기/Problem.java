package Level1_���_����_��������;

class Solution {
    public String solution(String s) {
    	String[] sarr = s.split("");
    	if(sarr.length%2==1) return sarr[sarr.length/2];
    	else return sarr[sarr.length/2-1] + sarr[sarr.length/2];
    }
}

public class Problem {

	public static void main(String[] args) {
		
	}
}

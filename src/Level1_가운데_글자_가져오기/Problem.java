package Level1_가운데_글자_가져오기;

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

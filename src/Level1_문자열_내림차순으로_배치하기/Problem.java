package Level1_���ڿ�_������������_��ġ�ϱ�;

import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
    	String[] arr = s.split("");
    	Arrays.sort(arr, Collections.reverseOrder());
        return String.join("", arr);
    }
}

public class Problem {

	public static void main(String[] args) {
		Solution so = new Solution();
		so.solution("Zbcdefg");
	}
}

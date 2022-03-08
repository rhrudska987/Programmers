package Level2_소수_찾기;

import java.util.HashMap;

class Solution {
	public int solution(String numbers) {
		HashMap<Integer, Boolean> hash = new HashMap<>();
		
		String range_str = "";
		for(int i=0; i<numbers.length(); i++) //범위를 자릿수에 따라 0~999..로 정함
			range_str += "9";
		
		int range = Integer.parseInt(range_str);
		
		for(int i =2; i<range; i++) {
			StringBuffer sb = new StringBuffer(numbers);
			String[] i_split = String.valueOf(i).split("");
			int count = 0;
			for(int j =0; j<i_split.length; j++) { 
				if(sb.toString().contains(i_split[j])) { 
					int n=sb.toString().indexOf(i_split[j]);
					sb.deleteCharAt(n);
					count++;
				}
			}
			if(count>=i_split.length) {
				boolean check = true;
				for(int j=2; j<=(int)Math.sqrt(i); j++) {  //소수 여부 판단
					if(i%j==0) {
						check = false;
						continue;
					}
				}
				if(check) 
					hash.put(i, true);
			}
		}
		
		int answer = hash.size();
		return answer;
	}
}

public class Problem {

	public static void main(String[] args) {
		Solution so = new Solution();
		System.out.println(so.solution("017"));		
	}

}

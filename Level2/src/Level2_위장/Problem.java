package Level2_위장;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Solution {
    public int solution(String[][] clothes) {
    	HashMap<String, String> map = new HashMap<>();
    	HashSet<String> set = new HashSet<>(); //옷 종류를 넣을 hashset
    	for(int i=0; i<clothes.length; i++) {
    		map.put(clothes[i][0], clothes[i][1]);
    		set.add(clothes[i][1]);
    	}
    	
        int answer = 1;
        Iterator<String> iter = set.iterator();
        while(iter.hasNext()) {
        	int count = 1;
        	String cloth = iter.next();
        	Set<String> keySet = map.keySet();
        	for(String key : keySet) {
        		if(cloth.equals(map.get(key)))
        			count++;
        	}
        	answer *= count;
        }
        return answer-1; //전부 안입는 경우는 없으니 -1
    }
}

public class Problem {

	public static void main(String[] args) {
		Solution so = new Solution();
		String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
		System.out.println(so.solution(clothes));
	}
	
}

package Level2_¿ß¿Â;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Solution {
    public int solution(String[][] clothes) {
    	HashMap<String, String> map = new HashMap<>();
    	HashSet<String> set = new HashSet<>();
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
        return answer-1;
    }
}

public class Problem {

	public static void main(String[] args) {
		Solution so = new Solution();
		String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
		System.out.println(so.solution(clothes));
	}
	
}

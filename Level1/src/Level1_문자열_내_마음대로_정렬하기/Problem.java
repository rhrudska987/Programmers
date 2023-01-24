package Level1_문자열_내_마음대로_정렬하기;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strings, int n) {   
    	ArrayList<byte[]> list = new ArrayList<>();
    	for(int i=0; i<strings.length; i++) {
    		byte[] bytes = strings[i].getBytes(StandardCharsets.US_ASCII);
    		list.add(bytes);
    	}
    	
    	int i=0, j=0;    	
    	for(i=1; i<strings.length; i++) {
    		byte[] temp_array = list.get(i);
    		j=i;
    		int count = n;
    		boolean check = false;
    		if(list.get(j-1)[n]==temp_array[n]) {
				count = 0;
				check = true;
    		}
    		while((j>0)&&list.get(j-1)[count]>=temp_array[count]) {
    			if(list.get(j-1)[count]==temp_array[count]) {
    				if(check==false) {
    					count = 0;
    					check = true;
    				}
    				else {
    					count++;
    				}
    				if(count>=temp_array.length) break;
    			}
    			else if(list.get(j-1)[count]>temp_array[count]){
    				list.set(j, list.get(j-1));
    				j = j-1;
    				list.set(j, temp_array);
    				count=n;
    				check = false;
    			}
    		}
    	}
    	
    	String[] answer = new String[strings.length];
    	for(int k=0; k<answer.length; k++) {
    		answer[k] = new String(list.get(k));
    		System.out.println(answer[k]);
    	}
        return answer;
    }
}

public class Problem {

	public static void main(String[] args) {
		String[] strings = {"abce", "abcd", "cdx"};
		Solution so = new Solution();
		so.solution(strings, 2);
	}
}

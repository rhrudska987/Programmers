package Level2_전화번호_목록;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public boolean solution(String[] phone_book) {
    	ArrayList<String> phone_bookList = new ArrayList<>(Arrays.asList(phone_book));
    	Collections.sort(phone_bookList);
    	for(int i=0; i<phone_book.length-1; i++) {
    		String prefix = phone_bookList.get(i);
    		if(prefix.length()<=phone_bookList.get(i+1).length()) {
    			String wordSub = phone_bookList.get(i+1).substring(0, prefix.length());
        		if(prefix.equals(wordSub))
        			return false;
    		}
    	}
        return true;
    }
}

public class Problem {

	public static void main(String[] args) {
		Solution so = new Solution();
		String[] phone_book = {"119", "114", "112", "123223123", "1231231234"};
		System.out.println(so.solution(phone_book));
		
	}

}

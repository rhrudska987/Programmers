package Level1_���￡��_�輭��_ã��;

class Solution {
    public String solution(String[] seoul) {
    	int count = 0;
    	for(int i=0; i<seoul.length; i++) {
    		if(seoul[i].equals("Kim"))
    			count = i;
    	}
        return "�輭���� " + count + "�� �ִ�";
    }
}

public class Problem {

	public static void main(String[] args) {
		
	}
}

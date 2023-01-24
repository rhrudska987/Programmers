package Level1_�Ű�_���_�ޱ�;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        HashSet<String> set = new HashSet<>();
        for(int i=0; i<report.length; i++) //hash�Լ��� �̿��Ͽ� �ߺ� ����
        	set.add(report[i]);
        
        Iterator<String> it = set.iterator();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<set.size(); i++) {//list�� �Ű��ڿ� �Ű���� ������ ���� �߰�
        	String[] arr = it.next().split(" ");
        	list.add(arr[0]);
        	list.add(arr[1]);
        }
        
        int[] report_times = new int[id_list.length];
        for(int i=1; i<list.size(); i+=2) { //���� �Ű���� Ƚ�� ����
        	for(int j=0; j<id_list.length; j++) {
        		if(list.get(i).equals(id_list[j])) {
        			report_times[j]++;
        			break;
        		}
        	}
        }
    	
        int[] answer = new int[id_list.length];
        for(int i=0; i<report_times.length; i++) {//������ �޴� ���� �� ����
        	if(report_times[i]>=k) {
        		for(int j=1; j<list.size(); j+=2) {
        			if(id_list[i].equals(list.get(j))) {
        				for(int l=0; l<id_list.length; l++) {
        					if(id_list[l].equals(list.get(j-1))) answer[l]++;
        				}
        			}
        		}
        	}
        }
        return answer;
    }
}

public class Problem {

	public static void main(String[] args) {
		String[] id_list = {"con", "ryan"};
		String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
		Solution so = new Solution();
		so.solution(id_list, report, 3);
	}
}

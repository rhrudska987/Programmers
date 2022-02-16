package Level2_오픈채팅방;

import java.util.ArrayList;
import java.util.HashMap;

class Solution {
	public String[] solution(String[] record) {
		String[] state = new String[record.length];
		String[] id = new String[record.length]; 
		String[] name = new String[record.length];
		HashMap<String, String> map_id_name = new HashMap<>(); //id와 name을 넣을 map
		ArrayList<String> list_state_id = new ArrayList<>();   //state와 id를 넣을 list
		
		for (int i = 0; i < record.length; i++) { //record인자를 state, id, name 3가지로 분리
			String[] record_split = record[i].split(" ");
			if (record_split.length == 3) { //Enter, Change
				state[i] = record_split[0];
				id[i] = record_split[1];
				name[i] = record_split[2];
				map_id_name.put(id[i], name[i]);
				list_state_id.add(state[i] + " " + id[i]);
			} 
			else {  						//Leave의 경우 name은 없음
				state[i] = record_split[0];
				id[i] = record_split[1];
				name[i] = "null";
				list_state_id.add(state[i] + " " + id[i]);
			}
			
		}
		
		ArrayList<String> answerList = new ArrayList<>();
		for(int i=0; i<list_state_id.size(); i++) { //state에 따라 알맞은 문장을 answerList에 삽입
			String[] array_state_id = list_state_id.get(i).split(" ");
			switch(array_state_id[0]) {
				case "Enter":
					answerList.add(map_id_name.get(array_state_id[1]) + "님이 들어왔습니다.");
					break;
				case "Leave":
					answerList.add(map_id_name.get(array_state_id[1]) + "님이 나갔습니다.");
					break;
			}
		}
		
		String[] answer = new String[answerList.size()]; //list->array
		int size=0;
		for(String temp : answerList){
		  answer[size++] = temp;
		}
		return answer;
	}
}
public class Problem {

	public static void main(String[] args) {
		Solution so = new Solution();
		String[] record = {"Enter uid123 uid1234", "Leave uid123", "Enter uid4567 uid123", "Change uid4567 uid1234", "Leave uid4567"};
		so.solution(record);
	}
}


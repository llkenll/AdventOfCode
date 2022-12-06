import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class three {
	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<>();
		Scanner obj = new Scanner(System.in);
		List<List<String>> lis = new ArrayList<>();
		List<String> cur = new ArrayList<>();
		
		
		
		char[] alp = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		
		int j = 27;
		for(int i = 0; i < alp.length; i++) {
			char c = alp[i];
			map.put(c,  i+1);
			map.put(Character.toUpperCase(c), j);
			j++;
		}
		
		long total = 0;
		
		while(true) {
			
			
			String next = obj.nextLine();
			
			if(next.equals("end")) {
				
				break;
			}
			
			int mid = next.length()/2;
			String p1 = next.substring(0, mid);
			String p2 = next.substring(mid);
			
			char res = compare(p1, p2, map);
			
			total+=map.get(res);
			
		}
		
		System.out.println(total);
		
		
	}
	
	public static char compare3(String s1, String s2, String s3, Map<Character, Integer> map) {
		List<Character> all = new ArrayList<>();
		
		for(char c: s1.toCharArray()) {
			for(char c2: s2.toCharArray()) {
				for(char c3: s3.toCharArray()) {
					if(c == c2 && c2 == c3) {
						all.add(c);
					}
				}
				
			}
		}
		int min = 100;
		char res = all.get(0);
		
		for(char c: all) {
			int cur = map.get(c);
			if(cur < min) {
				min = cur;
				res = c;
			}
		}
		
		return res;
		
		
		
		
	}
	
	
	public static char compare(String s1, String s2, Map<Character, Integer> map) {
		List<Character> all = new ArrayList<>();
		
		for(char c: s1.toCharArray()) {
			for(char c2: s2.toCharArray()) {
				if(c == c2) {
					all.add(c);
				}
			}
		}
		int min = 100;
		char res = all.get(0);
		
		for(char c: all) {
			int cur = map.get(c);
			if(cur < min) {
				min = cur;
				res = c;
			}
		}
		
		return res;
		
		
		
		
	}


}

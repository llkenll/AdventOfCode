import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class one {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		List<List<String>> lis = new ArrayList<>();
		List<String> cur = new ArrayList<>();
		while(true) {
			
			
			
			String next = obj.nextLine();
			
			if(next.equals("end")) {
				lis.add(cur);
				break;
			}
			
			if(!next.isBlank()) {
				
				cur.add(next);
			}else {
				lis.add(cur);
				cur = new ArrayList<>();
				
			}
			
			
		}
		
		List<Integer> res = new ArrayList<>();
		
		
		for(List<String> l : lis) {
			int total = 0;
			
			for(String num: l) {
				total+=Integer.valueOf(num);
			}
			
			res.add(total);
		}
		
		
		Collections.sort(res, Collections.reverseOrder());
		int t = 0;
		for(int i = 0; i < 3; i++) {
			t+=res.get(i);
		}
		System.out.println(lis.toString());
		System.out.print(t);
	}

}

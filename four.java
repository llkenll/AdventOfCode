import java.util.ArrayList;
import java.util.Scanner;

public class four {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int total = 0;
		while(true) {
			
			
				String next = obj.nextLine();
				
				if(next.equals("end")) {
					
					break;
				}
				
				String[] pair = next.split(",");
				String[] first = pair[0].split("-");
				String[] second = pair[1].split("-");
				
				if(overlap(first, second,false)) {
					total+=1;
				}
				
				//2,8 3,7
				//end1 >= start2
				//start1 <= start2
				//end2 <= end1
			
	
		}
		
		System.out.println(total);

	}
	
	
	public static boolean overlap(String[] first, String[] second, boolean s) {
		int s1 = Integer.valueOf(first[0]);
		int end1 = Integer.valueOf(first[1]);
		int s2 = Integer.valueOf(second[0]);
		int end2 = Integer.valueOf(second[1]);
		if(s1 <= s2 && end2 <= end1 && end1 >= s2) {
			return true;
		}else if(!s){
			return overlap(second, first, true);
		}
		
		return false;
	}

}

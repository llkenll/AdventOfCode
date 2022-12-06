import java.util.Arrays;
import java.util.Scanner;

public class fourB {

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
				int[] a = Arrays.stream(first).mapToInt(Integer::parseInt).toArray();
				int[] b = Arrays.stream(second).mapToInt(Integer::parseInt).toArray();
				if(a[0] < b[0]) {
					if(overlap(first, second,false)) {
						
						total+=1;
					}
				}else {
					if(overlap(second, first,false)) {
						
						total+=1;
					}
				}
				
				
				
	
		}
		
		System.out.println(total);
	}
	
	
	public static boolean overlap(String[] first, String[] second, boolean s) {
		int s1 = Integer.valueOf(first[0]);
		int end1 = Integer.valueOf(first[1]);
		int s2 = Integer.valueOf(second[0]);
		int end2 = Integer.valueOf(second[1]);
		if(end1 < s2) {
			return false;
		}
		
		return true;
	}

}

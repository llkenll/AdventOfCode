import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class two {

	public static void main(String[] args) {
		Map<String, Integer> val = new HashMap<>();
		//a rock b paper c scisscors
		//x rock y paper z scisscors
		val.put("X", 1);
		val.put("Y", 2);
		val.put("Z", 3);
		
		Map<String, String> win = new HashMap<>();
		win.put("X", "C");
		win.put("Y", "A");
		win.put("Z", "B");
		
		Map<String, String> loss = new HashMap<>();
		loss.put("X", "B");
		loss.put("Y", "C");
		loss.put("Z", "A");
		
		
		Scanner scanner = new Scanner(System.in);
		
		int total = 0;
		while(true) {
			String next = scanner.nextLine();
			if(next.equals("end")) {
				break;
			}
			
			String[] sArr = next.split(" ");
			
			total+=val.get(sArr[1]);
			
			String opp = sArr[0];
			
			if(win.get(sArr[1]).equals(opp)) {
				total+=6;
			}else if(loss.get(sArr[1]).equals(opp)) {
				total+=0;
			}else {
				total+=3;
			}
			
		}
		
		System.out.println(total);
			
	
	}

}

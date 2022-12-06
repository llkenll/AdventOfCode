import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class twoB {

	public static void main(String[] args) {
		Map<String, Integer> val = new HashMap<>();
		//a rock b paper c scisscors
		//x rock y paper z scisscors
		val.put("X", 1);
		val.put("Y", 2);
		val.put("Z", 3);
		
		Map<String, String> win = new HashMap<>();
		win.put("C", "X");
		win.put("A", "Y");
		win.put("B", "Z");
		
		Map<String, String> loss = new HashMap<>();
		loss.put("B", "X");
		loss.put("C", "Y");
		loss.put("A", "Z");
		
		Map<String, String> cond = new HashMap<>();
		cond.put("X", "loss");
		cond.put("Y", "draw");
		cond.put("Z", "win");
		
		Map<String, String> tie = new HashMap<>();
		tie.put("A", "X");
		tie.put("B", "Y");
		tie.put("C", "Z");
		
		Scanner scanner = new Scanner(System.in);
		
		int total = 0;
		while(true) {
			String next = scanner.nextLine();
			if(next.equals("end")) {
				break;
			}
			
			String[] sArr = next.split(" ");
			
			String opp = sArr[0];
			
			if(cond.get(sArr[1]).equals("win")) {
				String w = win.get(opp);
				total+=val.get(w);
				total+=6;
			}else if(cond.get(sArr[1]).equals("loss")) {
				String l = loss.get(opp);
				total+=val.get(l);
			}else {
				total+=3;
				String d= tie.get(opp);
				total+=val.get(d);
			}
			
			
		}
		
		System.out.println(total);
			
	
	}

}


public class SpacedLogger implements Logger {

	@Override
	public void Log(String a) {
         System.out.println(Crazy(a));
	}

	private String Crazy(String a) {
		String space = "";
		
		for(int i = 0; i < a.length(); i++) {
	
			space += a.charAt(i) + " ";
		
}
		
	
	return space;
		}
		
	
		
	

	@Override
	public void Error(String a) {
System.out.println("Error:" + Crazy(a));
	}
}

	

	
	
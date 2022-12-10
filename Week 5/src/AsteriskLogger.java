
public class AsteriskLogger implements Logger{
    
	
	
	@Override
	public void Log(String a) {
		String txt = build(a);
		System.out.println(txt);
	}

	private String build(String a) {
		return "***" + a + "***";
	}

	@Override
	public void Error(String a) {
	String msg = "Error:";
	       String inner = "***" + msg + a + "***";
	
	       String outer = "*".repeat(inner.length());
       System.out.println(outer);
       System.out.println(inner);
       System.out.println(outer);
	}

}
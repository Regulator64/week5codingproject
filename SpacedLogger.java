package oop;

//Space implements the Logger Interface
public class SpacedLogger implements LoggerInterface {
	
	@Override
	public void log(String log) {
		System.out.println(log);
		
	}
	@Override
	public void error(String error) {
		System.out.println("ERROR" + error);
		
	}
	

}

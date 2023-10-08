package oop;

public class App {

	public static void main(String[] args) {
		AsteriskLogger myasterisk = new AsteriskLogger();
		myasterisk.log("Just info for you.");
		myasterisk.error("There is an error.");
		SpacedLogger myspace = new SpacedLogger();
		myspace.log("Y" + " " + "A" + " " + "Y");
		myspace.error(":" + " " + "Y" + " " + "I" + " " + "K" + " " + "E" +  " " + "S");

	}

}

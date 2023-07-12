package day03.misc;

class LoggerMain {

	public static void info(String msg) {
		System.out.println("INFO: " + msg);
	}

	public static void debug(String msg) {
		System.out.println("DEBUG: " + msg);
	}

}

public class Logger {

	public static void main(String[] args) {
		LoggerMain.debug("Debug message");
		LoggerMain.info("Info message");

	}
}
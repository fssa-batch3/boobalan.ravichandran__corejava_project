package day02.practice;

class Logger {
	public static void debug(String msg) {
		System.out.println("DEBUG: " + msg);
	}

	public static void info(String msg) {
		System.out.println("INFO: " + msg);
	}

	public static void error(String msg) {
		System.out.println("ERROR: " + msg);
	}

	public static void debug(int num) {
		System.out.println("DEBUG: " + num);
	}

	public static void info(int num) {
		System.out.println("INFO: " + num);
	}

	public static void error(int num) {
		System.out.println("ERROR: " + num);
	}

	public static void debug(boolean flag) {
		System.out.println("DEBUG: " + flag);
	}

	public static void info(boolean flag) {
		System.out.println("INFO: " + flag);
	}

	public static void error(boolean flag) {
		System.out.println("ERROR: " + flag);
	}
}

public class loggerMain {

	public static void main(String[] args) {
		Logger.debug("Debug message");
		Logger.info("Info message");
		Logger.error("Error message");

		Logger.debug(10);
		Logger.info(20);
		Logger.error(30);

		Logger.debug(true);
		Logger.info(false);
		Logger.error(true);

	}

}

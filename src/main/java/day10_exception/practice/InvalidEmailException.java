package day10_exception.practice;

class InvalidEmailException extends Exception {
	public InvalidEmailException(String message) {
		super(message);
	}
}

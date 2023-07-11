package day02.solved;

class CalculatorDefine {
	public int add(int a, int b) {
		return a + b;
	}

	public double add(double a, double b) {
		return a + b;
	}

	public String add(String a, String b) {
		return a + b;
	}
}

public class FunctionOverloading {

	public static void main(String[] args) {
		// Usage
		CalculatorDefine calc = new CalculatorDefine();
		System.out.println(calc.add(7, 9)); // Output: 5
		System.out.println(calc.add(8.9, 9.7)); // Output: 6.2
		System.out.println(calc.add("Nature", "Beauty")); // Output: HelloWorld

	}

}

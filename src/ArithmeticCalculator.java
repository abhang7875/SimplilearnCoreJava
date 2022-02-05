
public class ArithmeticCalculator {
	public int add(int a, int b) {
		return a + b;
	}

	public double add(double a, double b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public double subtract(double a, double b) {
		return a - b;
	}

	public int mutiply(int a, int b) {
		return a * b;
	}

	public double multiply(double a, double b) {
		return a * b;
	}

	public int division(int a, int b) {
		if (b != 0)
			return a / b;
		return 0;
	}

	public double division(double a, double b) {
		if (b != 0)
			return a / b;
		return 0.0;
	}

	public static void main(String[] args) {
		ArithmeticCalculator calc = new ArithmeticCalculator();
		System.out.println("Testing add(int,int): " + calc.add(10, 10));
		System.out.println("Testing add(double,double): " + String.format("%.2f", calc.add(12.5, 3.8)));
		System.out.println("Testing subtract(int,int): " + calc.subtract(10, 2));
		System.out.println("Testing subtract(double,double): " + String.format("%.2f", calc.subtract(8.20, 3.60)));
		System.out.println("Testing multiply(int,int): " + calc.multiply(5, 2));
		System.out.println("Testing multiply(double,double): " + String.format("%.2f", calc.multiply(1.3, 4.3)));
		System.out.println("Testing division(int,int): " + calc.division(10, 2));
		System.out.println("Testing division(double,double): " + String.format("%.2f", calc.division(4.8, 1.2)));
	}
}

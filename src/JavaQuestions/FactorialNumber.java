package JavaQuestions;

public class FactorialNumber {

	public static void main(String[] args) {

		// !5 = 5x4x3x2x1 = 120
		// !4 = 24
		// !0 = 1

		int num = 0;
		getFact(num);

	}

	public static void getFact(int num) {

		System.out.println("this is my fact code");
		int fact = 1;

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("factorial of " + num + " is :" + fact);
	}

}

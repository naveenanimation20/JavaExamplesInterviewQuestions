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
<<<<<<< HEAD
		System.out.println("get fact number");
		System.out.println("my code....");
=======
		System.out.println("this is my fact code");
>>>>>>> 98d24d1d0fe65b0ab72a1399f95adae7fe19e9ae
		int fact = 1;

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("factorial of " + num + " is :" + fact);
	}

}

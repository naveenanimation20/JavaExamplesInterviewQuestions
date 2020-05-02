package JavaQuestions;

public class LargestAmongThreeNumbers {

	public static void main(String[] args) {

		int x = 1100;
		int y = 1500;
		int z = 1100;
		
		
		if(x>y && x>z){
			System.out.println("x is the greatest");
		}
		
		else if (y>z){
			System.out.println("y is the greatest");

		}
		else{
			System.out.println("z is the greatest");
		}
		
		
		if(x>=y){
			if(x>=z){
				System.out.println("x is the greatest");
			}
			else{
				System.out.println("z is the greatest");
			}
		}
		else{
			if(y>=z){
				System.out.println("y is the greatest");
			}
			else{
				System.out.println("z is the greatest");
			}
		}
		
		
	}

}

// For Loop practice program: Find the number of stars by looping the string 'Star' iteratively, and stop at 10.

public class forLoops {
	
	public static void main(String[] args) {
		int row, numberOfStars;
	
		for(row = 1; row <=10; row++) {
		for(numberOfStars = 1; numberOfStars <= row; numberOfStars++) {
			System.out.println("Star");
		}
		System.out.println("Go to next line");
		}
	}
}

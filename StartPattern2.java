//Write a java program to print the following Pattern
/*
             *****
             ****
             ***
             **
             *
 */
public class StartPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<5; i++) {
			for(int j=5; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

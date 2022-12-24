//Write a java program to print the following pattern
/*
         1
         21
         321
         4321
         54321
 */
public class NumberPattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=5; i++) {
			for(int j=i; j>=1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}

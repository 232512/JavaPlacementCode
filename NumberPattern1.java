//Write a java program to print the following the pattern
/*
                     1
                     12
                     123
                     1234
 */
public class NumberPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=5; i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}

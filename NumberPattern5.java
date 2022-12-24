//Write a java program to print the following pattern
/*
                 1
                 121
                 12321
                 1234321
                 123454321
 */
public class NumberPattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=5; i++) {
			for(int j=1;j<=i; j++) {
				System.out.print(j);
			}
			for(int k=i-1;k>=1;k--) {
				System.out.print(k);
			}
			System.out.println();
		}

	}

}

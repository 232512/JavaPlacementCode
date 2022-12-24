
//Write a java program to print the following pattern
/*
                       *
                      ***
                     *****
                    *******
 */
public class StartPattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=5; i++) {
			for(int k=4; k>=i; k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i; j++) {
				System.out.print("*");
			}
			for(int l=2; l<=i; l++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}


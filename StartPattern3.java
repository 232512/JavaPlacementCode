//Write a java program to print the following pattern
/*
                *
                **
                ***
                ****
                *****
                ****
                ***
                **
                *
 */
public class StartPattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<6; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<6; i++) {
			for(int j=5; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

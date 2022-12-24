//Write a java program to print the following pattern
/*
             54321
             5432
             543
             54
             5
 */
public class NumberPattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}

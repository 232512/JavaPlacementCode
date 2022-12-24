//Write a java program to print the following pattern
/*
           1
           23
           456
           78910
 */
public class NumberPattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1; i<=5; i++) {
			
			for(int j=1; j<=i; j++) {
				count++;
				System.out.print(count);
			}
			System.out.println();
		}

	}

}

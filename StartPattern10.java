
public class StartPattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<6;i++) {
			for(int k=4;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			for(int j=2;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<6;i++) {
			for(int k=0;k<i;k++) {
				System.out.print(" ");
			}
			for(int j=4;j>=i;j--) {
				System.out.print("*");
			}
			for(int l=3;l>=i;l--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

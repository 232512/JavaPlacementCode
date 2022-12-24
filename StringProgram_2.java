//Write a java program to print the string palindrome or not
public class StringProgram_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="nitin";
		String rev="";
		for(int i=str.length()-1; i>=0; i--) {
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
			System.out.println(true);
		else
			System.out.println(false);
	}

}

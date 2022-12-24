//Write a java program to print the reverse of string with function without function
public class StringProgram_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Reverse of string with function
		StringBuilder sb=new StringBuilder("Arun");
		System.out.println(sb.reverse());
		//Reverse of string without function
		String str="Good Morning";
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i)+" ");
		}

	}

}

//Write a java program to capitalized first character of a string 
public class StringProgram_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String str="hello ";
		String firstletter=str.substring(0,1);
		String remaining=str.substring(1,str.length());
		firstletter=firstletter.toUpperCase();
		remaining=firstletter+remaining;
		System.out.println(remaining);*/
		
		//with multiple word
		String str2="programming pencil used";
		String word[]=str2.split("\\s");
		String newString="";
		for(String w:word) {
			String first=w.substring(0,1);
			String rest=w.substring(1);
			newString+=first.toUpperCase()+rest+" ";
			
			
		}
		
		System.out.println(newString);

	}

}

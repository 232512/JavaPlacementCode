//Write a java program to swap the two number with or without operator;
public class Swaping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Swaping without operator with third variable
		int a=10;
		int b=20;
		int temp;
		System.out.println("Before Swaping ");
		System.out.print(a+" "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("\nAfter Swaping ");
		System.out.println(a+" "+b);
		
		//Swaping with operator without third variable
		int x=10,y=20;
		System.out.println("Before Swaping ");
		System.out.print(x+" "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("\nAfter Swaping ");
		System.out.println(x+" "+y);
		
		//Swaping without operator without third variable
		int p=10,q=20;
		System.out.println("Before Swaping ");
		System.out.print(p+" "+q);
		p=p^q;
		q=p^q;
		p=p^q;
		System.out.println("\nAfter Swaping ");
		System.out.println(p+" "+q);
		
		
				
		
		

	}

}

//Write a java program to perform the constructor overloading
class ExampleConstructorO{
	int a; double b; String c; 
	ExampleConstructorO(){
		a=100; b=45.32; c="ankit";
		
	}
	ExampleConstructorO(int x){
		a=x;
	}
	ExampleConstructorO(double x, String z){
		b=x;
		c=z;
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleConstructorO r=new ExampleConstructorO();
		ExampleConstructorO r2=new ExampleConstructorO(10);
		ExampleConstructorO r3=new ExampleConstructorO(23.45,"Arun");
		System.out.println(r.a+" "+r.b+" "+r.c);
		System.out.println(r2.a);
		System.out.println(r3.b+" "+r3.c);
		

	}

}

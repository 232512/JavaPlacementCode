//Write a java program to perform the hierarchical inheritance
class Aoppl{
	void input() {
		System.out.println("Enter Your Name");
	}
}
class Bull extends Aoppl{
	void show() {
		System.out.println("My name is Arun");
	}
}
class Cooma extends Aoppl{
	void disp() {
		System.out.println("My name is Tarun");
	}
}
public class Inheritance_hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bull r=new Bull();
		Cooma r2=new Cooma();
		r.input();
		r.show();
		r2.input();
		r2.disp();
		

	}

}

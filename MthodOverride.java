//Write a java program to performe the method override
class shape{
	void draw() {
		System.out.println("Can't Say shape Type");
	}
}
class square extends shape{
	@Override
	void draw() {
		System.out.println("square shape");
	}
}
public class MthodOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape r=new square();
		r.draw();
		
		
		

	}

}

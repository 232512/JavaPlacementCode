//Write a java program to perform the hybrid inheritance
class Sommstuden{
	int roll=101;
	int practical=50;
}
class Exam extends Sommstuden{
	int theory=100;
	int pm=theory+practical;
}
interface Project{
	int pmark=200;
	void display();
}
class FinalResult extends Exam implements Project{
	int sum=pm+Project.pmark;
	public void display() {
		System.out.println("Roll Number: "+roll);
		System.out.println("Theory="+theory);
		System.out.println("Practical="+practical);
		System.out.println("Project="+Project.pmark);
		System.out.println("Total Marks"+sum);
	}
}
public class Inherittance_hybrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalResult obj=new FinalResult();
		obj.display();
		
		

	}

}

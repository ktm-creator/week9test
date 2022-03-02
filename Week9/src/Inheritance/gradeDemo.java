package Inheritance;
 import javax.swing.JOptionPane;
public class gradeDemo {

	public static void main(String[] args) {
		
		gradedActivity g1= new gradedActivity ();
		int question, missed; 
		String input; 
		
		input= JOptionPane.showInputDialog("How many questions" );
		question=Integer.parseInt(input);
	
		input= JOptionPane.showInputDialog("How many missed" );
		missed=Integer.parseInt(input);
	
		FinalExam exam= new FinalExam(question,missed);
		exam.display(); // acc to the object display method will work 
		// this is called the dynamic binding 
		
	}

}

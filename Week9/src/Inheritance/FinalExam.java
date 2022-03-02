package Inheritance;

import javax.swing.JOptionPane;

public class FinalExam extends gradedActivity{
	
	private int numQuestions; 
	private double pointEach;
	private int numMissed; 

	public FinalExam(int numQuestions,int numMissed)
	{
		this.numMissed=numMissed; 
		this.numQuestions=numQuestions;
		
		pointEach= 100.0/numQuestions;
		double score= 100-(numMissed*pointEach);
		setScore(score);
		
	}
	public void foo()
	{
		System.out.println(score1);
	}
	// overriding 
	@Override
	public void display() {
		super.display();
		JOptionPane.showMessageDialog(null,"Each question counts "+ pointEach+
				"\n Your Score is" +getScore()+" your grade is :" + getGrade());
		// for accessing parent class method
		//super and this can only be used with not static method 
	}
	
}

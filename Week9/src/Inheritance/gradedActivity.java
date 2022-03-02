package Inheritance;

import javax.swing.JOptionPane;

public class gradedActivity { // if we add final then it cannot be inherited

	private double score;
	protected double score1;

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	} 
	public char getGrade() //stub
	{
		char letterGrade=' '; 
		if(score>=90)
		{
			letterGrade='A';
		}else if(score>=90)
		{
			letterGrade='A';
		}else if(score>=80)
		{
			letterGrade='B';
		}else if(score>=70)
		{
			letterGrade='C';
		}else if(score>=60)
		{
			letterGrade='P';
		}
		
		return letterGrade;
	}

	public void display() {
            JOptionPane.showConfirmDialog(null, " hello ");
	}
}

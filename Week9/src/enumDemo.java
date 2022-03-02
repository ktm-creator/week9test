import java.util.*;
public class enumDemo {

	public static void main(String[] args) {
		Day today; 
		today=Day.tues;
       Day tom= Day.mon;
       
       Scanner input= new Scanner (System.in);
       // enum array 
       // value of gives the array of enum 
       // might ask you create a enum type of variable
       for (Day d:Day.values())
       {
    	   System.out.println(d);
       }
       
       System.out.println(" What day is today? Enter only first three character ");
       String newDay= input.nextLine(); // need to convert to enum type
       
       // if need to change it to upper case do it
       
      Day userInput= Day.valueOf(newDay); // converted the string to enum constant 
      
      
      switch(userInput)
      {
      case sun:
    	  System.out.println(" it is sunday");
          break;
      case mon:
    	  System.out.println(" it is monday");
    	  break;
      case tues:
    	  System.out.println(" it is tuesday");
    	  break;
      default:
            System.out.println(" it is invalid");
      }
	}

}


public class IfStatementEx {

	public static void main(String[] args) {
//if statement
		int marks = 1234;
		if (marks > 500) {
			System.out.println("*****CONGRATULATIONS*****");
		}
		System.out.println("After If statement");

//if-else		
		marks = 90;
		if (marks > 900)
			System.out.println("*****First Class*****");
		else
			System.out.println("***Second Class**");

		System.out.println("After If-else statement");
		
//else-if	
		String name="inda";
		int length=name.length();
		if(length>6)
			System.out.println("its above 6 length");
		else if(length<6 && length>4)
			System.out.println("its exactly 5 as a length");
		else if(length<=6  && length>=4)
			System.out.println("the length can be 4/6/5");
		else
			System.out.println("the length is below 4 ");
			
		System.out.println("after else if /else ");
//nested if
		int age=25;  
		int weight=70;    
		
		if(age>=18)
	        if(weight>50)
		          System.out.println("You are eligible");  
		   
		           

		
		
		
	}

	
	
	
}
//ctrl+shift+f
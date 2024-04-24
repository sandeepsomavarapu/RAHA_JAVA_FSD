class Variables_Ex
{
	boolean result=true;//global variable -->instance 1 bit
	static int countryCode=91;//global variable --> static  4 bytes
public static void main(String args[])
{
	byte age=22;//local variables
	long contact=949494949l;
	float salary=23.4198371205283f;
	double price=23.4198371205283;
	char gender='M';
	System.out.println(age+" "+contact+" "+salary+" "+price+" "+gender);
		
	Variables_Ex obj=new Variables_Ex();
			System.out.println(obj.result)//accessing instance variable by using object reference
			System.out.println(Variables_Ex.countryCode)//accessing instance variable by using object references
}
}
			
public class Methods_Ex{//PascalCase
	
	public static void displayMsg()//camelCase
	{
		System.out.println("Hello !!! welcome to methods...");
	}
	public void addOfTwo(int a,int b)
	{
		System.out.println("add of two numbers :"+(a+b));
	}
	public String displayDate()
	{
		return "25-04-2024";
	}
	public int mulOfTwo(int a,int b)
	{
		return a*b;
	}
	
	public static void main(String asrgs[])
	{
		Methods_Ex.displayMsg();
		Methods_Ex objName=new Methods_Ex();
		objName.addOfTwo(22,32);
		System.out.println(objName.mulOfTwo(22,32));
		String date=objName.displayDate();
		System.out.println("Todays Date :"+date);
	}
	
	
}
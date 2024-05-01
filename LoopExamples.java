
public class LoopExamples {

	public static void main(String[] args) {

//		for (int i = 1; i <= 100; i++) {
//			if (i % 2 == 0)
//				System.out.println(i);
//		}
//		int i = 1, n = 5;
//		while (i < n) {
//			System.out.println(i);
//			i++;
//		}

//		int i = 0;
//		do {
//		  System.out.println(i);
//		  i++;
//		}
//		while (i < 5);

//		int n, i;
//		n=2;
//		for(i=1;i<=10;i++)
//		{  
//			System.out.println(n+"*"+i+"="+n*i);  
//		}  

		for (int i = 1; i <= 3; i++) {//1
			
			for (int j = 1; j <= 3; j++) {
				System.out.print(i + " " + j+"  ");   //1 1  1 2  1 3  2 1  2 2 2 3  3 1 3 2 3 3
			}
			System.out.println();
		}
	}

}

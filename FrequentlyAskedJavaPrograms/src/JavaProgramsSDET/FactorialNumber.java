package JavaProgramsSDET;

public class FactorialNumber {
	public static void main(String[] args) {
		
		int num=5;
		
		long factorial=1;
		
		//Incremental order --> 5! = 1*2*3*4*5=120
		
//		for(int i=1; i<=num; i++)
//		{
//			factorial = factorial*i;   //1 2 6 24 120
//		}
		
		//Decremental order --> 5! = 5*4*3*2*1=120
		
		for(int i=num; i>=1; i--)
		{
			factorial = factorial*i;  // 5 20 60 120 120
		}
		System.out.println("Factorial of a number:" + factorial);
	}

}

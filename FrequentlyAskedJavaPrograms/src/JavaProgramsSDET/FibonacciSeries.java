package JavaProgramsSDET;

//0 1 1 2 3 5 8 13 21 34
//0+1=1 1+1=2 1+2=3 2+3=5

public class FibonacciSeries {
	public static void main(String[] args) {
		
		int n1=0, n2=1, sum=0;
		
		System.out.print(n1+" "+n2);   //0 1
		
		for (int z=2; z<=20; z++)
		{
			sum= n1+n2;  					//0+1 =1  1+1=2
			System.out.print(" "+sum);  //1 2 3 5 8 13 21 34
			
			n1=n2;  //n1=1, n2=1 ,, n1=1, n2=2
			n2=sum;
		}
	}

}

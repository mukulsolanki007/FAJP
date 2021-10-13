package JavaProgramsSDET;

public class MaxAndMinElementInArray {
	public static void main(String[] args) {
		
		int a[]= {50,100,40,20,60};
		
		/*
		int max=a[0];   //50  40  20  60
		
		for (int i=1; i<a.length; i++)
		{
			if(a[i]>max)   //30>50-true  40>50-false  20>50-false  60>50-true
			{
				max=a[i];  //50 --> 60
			}
		}
		System.out.println("Max Element in array is:"+ max);
		*/
		
		int min=a[0];  
		
		for (int i=1; i<a.length; i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Min element in array is:"+ min);
	}

}

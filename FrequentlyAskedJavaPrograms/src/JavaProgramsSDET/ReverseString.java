package JavaProgramsSDET;

public class ReverseString {
	public static void main(String[] args) {
		
		//Logic1 --> Using + (string concatenation) operator
		
		String str="ABCD";
		
		String rev="";  //--> instead of using null we use empty ("") value
		
		int len=str.length();  //4
		
		for(int i=len-1; i>=0; i--) //3 2 1 0 -1  -->loop exit
		{
			rev = rev+str.charAt(i); //D C B A
		}
		
		//Logic 2 --> Using character array
		
//		char a[]=str.toCharArray();
//		int len=a.length;  //4
//		
//		for(int i=len-1; i>=0; i--)  //3 2 1 0 -1
//		{
//			rev= rev+a[i];  // D C B A
//		}
		System.out.println("Reversed String:" + rev);	
		
		
		//Logic 3 --> Using StringBuffer class
		
//		StringBuffer sb = new StringBuffer(str);
//		
//		System.out.println("Reversed String:" + sb.reverse());
	}

}

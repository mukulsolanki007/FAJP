package JavaProgramsSDET;

public class ReverseEachWordInString {
	public static void main(String[] args) {
		
		//Logic 1
		
		String str = "Welcome To Java";  //Original string
		
		String[] words =str.split(" ");  //Splitting string into words
		
		String reverseString="";
		
		for(String w:words)
		{
			String reverseword= "";
			
			for(int i=w.length()-1; i>=0; i--)  //0-6
			{
				reverseword=reverseword+w.charAt(i);
			}
		reverseString=reverseString+reverseword+" ";
		}
		System.out.println(reverseString);
	
		
		//Logic 2
		/*
		String str = "Welcome To Java";
		
		String[] words=str.split("\\s");
		
		String reverseword="";
		
		for(String w:words)
		{
			StringBuilder sb= new StringBuilder(w);
			sb.reverse();
			
			reverseword=reverseword+sb.toString()+" ";
		}
		System.out.println(reverseword);
		*/
}
}

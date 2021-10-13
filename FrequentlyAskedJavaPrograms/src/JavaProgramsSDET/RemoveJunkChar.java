package JavaProgramsSDET;

public class RemoveJunkChar {
	
	public static void main(String[] args) {
		
		String s="a*?c=a-e^%$#@! latin string 01234567890";
				
		s=s.replaceAll("[^a-zA-Z0-9]", "");  // --> replace special char with space
		
		System.out.println(s);
		
		String s1="a*?c=a-e^%$#@! latin string 01234567890";
		
		s1=s1.replaceAll("[a-zA-Z0-9]", "");
		
		System.out.println(s1);

	}

}

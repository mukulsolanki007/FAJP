package JavaProgramsSDET;

public class RemoveWhiteSpaces {
	public static void main(String[] args) {
		
		String str="Java    programming    selenium    automation";
		
		System.out.println("Before removing white spaces:" +str);
		
		str = str.replaceAll("\\s", " ");
		
		System.out.println("After removing spaces:" +str);
	}

}

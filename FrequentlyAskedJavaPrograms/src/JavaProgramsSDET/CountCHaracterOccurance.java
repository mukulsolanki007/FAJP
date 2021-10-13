package JavaProgramsSDET;

public class CountCHaracterOccurance {
	public static void main(String[] args) {
		
		String s="Java Programming java OOPS";
		
		int totalcount=s.length();   // total length
		
		int totalcount_afterRemove= s.replace("J", "").length();  // total length after removing J's
		
		int count= totalcount-totalcount_afterRemove;
		
		System.out.println("Number occrances of J is:" +count);
	}

}

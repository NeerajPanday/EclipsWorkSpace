package JavaConceptOfTheDay;

public class RemoveAllWhiteSpacesFromaString {

	public static void main(String[] args) {
		String s="Neeraj Kumar  Pandey";
		String ws=s.replaceAll("\\s", "");
		System.out.println(ws);

	}

}

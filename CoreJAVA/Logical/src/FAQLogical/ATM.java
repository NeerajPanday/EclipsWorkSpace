package FAQLogical;

public class ATM {
	
	public static void main(String[] args) {
		String s="1234567895";
		String  countryCard=calculate(s);
		 System.out.println(countryCard);
		}

	private static String calculate(String s) {
        String card="";
         String bankCard=s.substring(0,4);
        if(s.startsWith("1")&& bankCard.equalsIgnoreCase("1234") && s.length()==10){
        	card="Indaia "+"sbi";
        }else if(s.startsWith("1")&& bankCard.equalsIgnoreCase("12345") && s.length()==14){
        	card="India "+"AXIS";
        }
		return card;
	}
		}



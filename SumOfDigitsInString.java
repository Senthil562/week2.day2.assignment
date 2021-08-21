package week2.day2.assignment;

public class SumOfDigitsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Senth1234";
		int var=0;
		char[] strText=text.toCharArray();
		for(int i=0;i<strText.length;i++) {
			char charValue=strText[i];
			if(Character.isDigit(charValue)) {
					int intValue=Character.getNumericValue(charValue);
					var=var+intValue;
			}
		}
		System.out.println("The total sum in a given string is : "+ var);
	}

}
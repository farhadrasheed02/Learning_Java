package udemy_course;

public class CastingNumValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intValue = 9;
		double doublevalue=2.0;
	
		float floatvalue = 5.8f;
		String strvalue = "Farhad";
		byte byteValue = 9;
		short shortValue =55;
		
		int intValue1 = (int)doublevalue;
		byte bytevalue1 = (byte)intValue;
		System.out.println(intValue1);
		System.out.println(doublevalue);
		System.out.println(bytevalue1);
	}

}

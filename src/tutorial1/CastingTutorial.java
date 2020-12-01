package tutorial1;

public class CastingTutorial {

	public static void main(String[] args) {
		
		byte byteValue = 20;
		short shortValue = 55;
		int intValue = 888;
		long longValue = 23355;
		
		float floatValue = 8834.8f;
		float floatValue2 = (float)99.3; 			// with cast
		double doubleValue = 32.4;
		
		System.out.println("Byte Max Value is " + Byte.MAX_VALUE);
		
		intValue = (int)longValue;					// with cast
		
		System.out.println("Cast from long value to int value is " + intValue);

		doubleValue = intValue;						// without cast
		System.out.println("double value is " + doubleValue);
		
		intValue = (int)floatValue;					// with cast
		System.out.println("Cast from float value to int values " +  intValue);

		// This is incorrect; 128 is too big for a byte
		byteValue = (byte)128;						// with cast
		System.out.println("Cast a big value to a byte " + byteValue);
		
 	} // end main

} // end class CastingTutorial

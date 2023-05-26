
public class ConsoleInput {

	public static String getString() {
		try {

			byte arrInput[] = new byte[100];
			int length = System.in.read(arrInput);
			byte[] arrFinal = new byte[length - 2];
			System.arraycopy(arrInput, 0, arrFinal, 0, length - 2);
			
			String objString = new String(arrFinal);
			int value = Integer.parseInt(objString);
		
			
			return objString;
		
		} catch (Exception objException) {
			System.out.println(objException);
		}
		return null;
		
	}
	public static float getFloat() {
		
		String objString = getString();
		float value = Float.parseFloat(objString);
		return value;
	}
	public static int getInteger()
	{
		String objString = getString();
		int value = Integer.parseInt(objString);
		return value;
		
		
		
		
	}

}

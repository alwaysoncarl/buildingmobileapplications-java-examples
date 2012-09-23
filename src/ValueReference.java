
public class ValueReference {

	public static void main(String[] args) {
		testMethodParameters();
	}

	static void testAssignment() {
		//by value
		int i, j;
		i = 10;
		j = i;
		j = 22;
		System.out.println("i: "+i);//prints 'i: 10'
		System.out.println("j: "+j);//prints 'j: 22'

		//by reference
		java.lang.StringBuffer stringBuffer1 = new java.lang.StringBuffer("the original value");
		java.lang.StringBuffer stringBuffer2 = stringBuffer1;
		System.out.println("stringBuffer1: \""+stringBuffer1+"\"");//prints 'stringBuffer1: "the original value"'
		System.out.println("stringBuffer2: \""+stringBuffer2+"\"");//prints 'stringBuffer2: "the original value"'
		stringBuffer2.append(", and some new text");
		System.out.println("stringBuffer1: \""+stringBuffer1+"\"");//prints 'stringBuffer1: "the original value", and some new text'
		System.out.println("stringBuffer2: \""+stringBuffer2+"\"");//prints 'stringBuffer2: "the original value", and some new text'
	}
	
	static void testMethodParameters() {
		int i = 17;
		System.out.println("i: "+i); //prints 'i: 17'
		changeParameter(i);
		System.out.println("i: "+i); //prints 'i: 17'
		
		java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("the original value");
		System.out.println("stringBuffer: "+stringBuffer);//prints "the original value"
		changeParameter(stringBuffer);
		System.out.println("stringBuffer: "+stringBuffer);//prints "eulav lanigiro eht":!
	}
	
	static void changeParameter(int i) {
		i = i * 324;
	}
	
	static void changeParameter(java.lang.StringBuffer stringBuffer) {
		stringBuffer.reverse();
	}
}

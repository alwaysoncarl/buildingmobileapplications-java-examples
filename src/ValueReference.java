
public class ValueReference {

	public static void main(String[] args) {
		testAssignment();
	}

	static void testAssignment() {
		//by value
		int i, j;
		i = 10;
		j = i;
		j = 22;
		System.out.println("i: "+i);//prints 'i: 10'
		System.out.println("j: "+i);//prints 'j: 22'

		//by reference
		java.lang.StringBuffer stringBuffer1 = new java.lang.StringBuffer("the original value");
		java.lang.StringBuffer stringBuffer2 = stringBuffer1;
		System.out.println("stringBuffer1: \""+stringBuffer1+"\"");//prints 'stringBuffer1: "the original value"'
		System.out.println("stringBuffer2: \""+stringBuffer2+"\"");//prints 'stringBuffer2: "the original value"'
		stringBuffer2.append(", and some new text");
		System.out.println("stringBuffer1: \""+stringBuffer1+"\"");//prints 'stringBuffer1: "the original value", and some new text'
		System.out.println("stringBuffer2: \""+stringBuffer2+"\"");//prints 'stringBuffer2: "the original value", and some new text'
		
	}
}

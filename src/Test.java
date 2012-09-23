
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		println(args.length+" arguments found:");
		for( String arg : args ) {
			println(arg);
		}
	}
	
	static void println(String message) {
		System.out.println(message);
	}

}

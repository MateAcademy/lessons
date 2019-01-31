package lesson05.functionalInterfaces;

/**
 * @author spasko
 */
public class MainLambdaBasics {
	public static void main(String[] args) {
		TestInterface<Integer, String> testInterface = new TestInterface<Integer, String>() {
			@Override
			public String doSome(Integer t) {
				return "Number1: " + t;
			}
		};
		System.out.println(testInterface.doSome(123));

		testInterface = (Integer t) -> "Number2: " + t;
		System.out.println(testInterface.doSome(123));

		testInterface = (t) -> "Number3: " + t;
		System.out.println(testInterface.doSome(123));

		testInterface = t -> "Number4: " + t;
		System.out.println(testInterface.doSome(123));

		testInterface = t -> "Number5 dont use param ";
		System.out.println(testInterface.doSome(123));

		testInterface = i -> i.toString();
		System.out.println(testInterface.doSome(123));

		//testInterface = i->i.toString();
		testInterface = t -> ((Object) t).toString();
		System.out.println(testInterface.doSome(234));

		testInterface = Object::toString;
		System.out.println(testInterface.doSome(234));
		
		doReaction(t->"Number"+t);
	}
	
	static public <T, V> void doReaction(TestInterface<T, V> testInterface) {
		
	}
}

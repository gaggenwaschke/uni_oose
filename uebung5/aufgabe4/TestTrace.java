
public class TestTrace {

	public static void main(String[] args) {
		CallEg eg = new CallEg(); // use default constructor
		try {
			eg.methodA();
		} catch (ArithmeticException oops) {
			oops.printStackTrace();
		}
	}

}

// a) java.lang.ArithmeticException: / by zero
//		at CallEg.methodA(CallEg.java:2)
//		at TestTrace.main(TestTrace.java:7)

// b) java.lang.ArithmeticException: / by zero
//		at CallEg.methodC(CallEg.java:4)
//		at CallEg.methodB(CallEg.java:3)
//		at CallEg.methodA(CallEg.java:2)
//		at TestTrace.main(TestTrace.java:7)

// c) java.lang.ArithmeticException: / by zero
//		at CallEg.methodC(CallEg.java:20)
//		at CallEg.methodB(CallEg.java:12)
//		at CallEg.methodA(CallEg.java:4)
//		at TestTrace.main(TestTrace.java:7)
//	java.lang.ArithmeticException: / by zero
//		at CallEg.methodC(CallEg.java:20)
//		at CallEg.methodB(CallEg.java:12)
//		at CallEg.methodA(CallEg.java:4)
//		at TestTrace.main(TestTrace.java:7)
//	java.lang.ArithmeticException: / by zero
//		at CallEg.methodC(CallEg.java:20)
//		at CallEg.methodB(CallEg.java:12)
//		at CallEg.methodA(CallEg.java:4)
//		at TestTrace.main(TestTrace.java:7)
//	java.lang.ArithmeticException: / by zero
//		at CallEg.methodC(CallEg.java:20)
//		at CallEg.methodB(CallEg.java:12)
//		at CallEg.methodA(CallEg.java:4)
//		at TestTrace.main(TestTrace.java:7)
//
//	egal wer fängt, es wird der gesamte Trace ausgegeben

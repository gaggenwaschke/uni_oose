class CallEg {
	public void methodA() throws ArithmeticException { 
		try {
			methodB();
		} catch (ArithmeticException oops) {
			oops.printStackTrace();
			throw oops;
		}
	}
	public void methodB() throws ArithmeticException {
		try {
			methodC();
		} catch (ArithmeticException oops) {
			oops.printStackTrace();
			throw oops;
		}
	}
	public void methodC() throws ArithmeticException {
		try {
			int i = 1/0;
		} catch (ArithmeticException oops) {
			oops.printStackTrace();
			throw oops;
		}
	}
}
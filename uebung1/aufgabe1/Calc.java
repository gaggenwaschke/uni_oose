public class Calc {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		switch(c) {
			case 1: System.out.println("a+b="+(a+b));
				break;
			case 2: System.out.println("a-b="+(a-b));
				break;
			case 3: System.out.println("a*b="+(a*b));
				break;
			case 4: System.out.println("a/b="+(a/b));
				break;
			default: System.out.println("unknown command, [1..4]");
				break;
		}
	}
}

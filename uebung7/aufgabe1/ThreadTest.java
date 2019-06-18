public class ThreadTest {
	public static void main(String args[]){
		Thread t1 = new Thread(new DateCommand());
		t1.start();
		Thread t2 = new Thread(new CounterCommand());
		t2.start();
	}
}

// die Thread warten zuffällig bis zu einer Sekunde, bevor sie in den
// nächsten Schleifendurchlauf eintreten.
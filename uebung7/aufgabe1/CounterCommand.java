
public class CounterCommand implements Runnable {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			
			int sleepTime = new java.util.Random().nextInt(1000);
			
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
								
			}
		}
	}

}

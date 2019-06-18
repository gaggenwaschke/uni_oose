import java.util.Date;


public class DateCommand implements Runnable {

	public void run() {
		for (int i = 0; i < 10; i++) {
			Date now = new Date();
			System.out.println(now.toString());
			
			int sleepTime = new java.util.Random().nextInt(1000);
			
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
								
			}
		}
	}

}

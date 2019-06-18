import java.io.IOException;


public class DateiBeobachter implements Runnable {
	String path = null;
	java.io.File file = null;
	
	public DateiBeobachter(String path) {
		this.path = path;
	}
	
	public DateiBeobachter(java.io.File file) {
		this.file = file;
	}

	public void run() {
		// get file
		if (file == null)
		{
			file = new java.io.File(path);
		}
		
		if (!file.exists())
		{
			System.out.println("file does not exist. Please place in \"" +
					System.getProperty("user.dir") + "\". Quitting now.");
			return;
		}
		
		long lastMod = file.lastModified();
		
		while (true) {
			if (lastMod != file.lastModified())
			{
				lastMod = file.lastModified();
				System.out.println("Datei wurde modifiziert");
			}
			
			System.out.println("Beobachte Datei \"" + file.getName() + "\"");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// do nothing
			}
		}
	}
}

package group.syntax01;

interface WebDriver {

	void open();

	void close();

	String getTitle();

}

interface TakesScreenshot {
	void getScreenshot();

}

interface RemoteDriver extends WebDriver, TakesScreenshot {

	void navigate();

}

class ChromeDriver implements RemoteDriver {

	public void open() {
		System.out.println("Open Chrome");
	}

	public void close() {
		System.out.println("Close Chrome");
	}

	public String getTitle() {
		return "Chrome title";
	}

	public void getScreenshot() {
		System.out.println("Get screenshot in Chrome");
	}

	public void navigate() {
		System.out.println("Navigate page in Chrome");
	}

}

class SafariDriver implements RemoteDriver {

	public void open() {
		System.out.println("Open Safari");
	}

	public void close() {
		System.out.println("Close Safari");
	}

	public String getTitle() {
		return "Safari title";
	}

	public void getScreenshot() {
		System.out.println("Get screenshot in Safari");
	}

	public void navigate() {
		System.out.println("Navigate page in Safari");
	}

}

class FirefoxDriver implements RemoteDriver {

	public void open() {
		System.out.println("Open Firefox");
	}

	public void close() {
		System.out.println("Close Firefox");
	}

	public String getTitle() {
		return "Firefox title";
	}

	public void getScreenshot() {
		System.out.println("Get screenshot in Firefox");
	}

	public void navigate() {
		System.out.println("Navigate page in Firefox");
	}

}

public class Schematic {

	public static void main(String[] args) {

		RemoteDriver[] drivers = { new ChromeDriver(), new FirefoxDriver(), new SafariDriver() };

		for (RemoteDriver x : drivers) {
			x.open();
			x.navigate();
			System.out.println(x.getTitle());
			x.getScreenshot();
			x.close();
			System.out.println("=================");
			
		}

	}

}

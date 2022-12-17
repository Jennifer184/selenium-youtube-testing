package selinium;

import org.junit.AfterClass;
import org.junit.Test;

public class YouTubeTest {

    static YouTubeCoverageApp app;

    @Test
    public void test() throws InterruptedException {
    	app = new YouTubeCoverageApp();
    	Thread.sleep(5000);
    }
    
	 @AfterClass
	 public static void tearDown() throws InterruptedException {
		app.shutDown();
	}

}
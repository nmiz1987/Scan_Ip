import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;

public class myOpen extends Thread {
	Desktop desktop = Desktop.getDesktop();
	
	private String str;

	public myOpen(String str) {
		this.str = str;
	}

	@Override
	public void run() {

			try {
				URI url = new URI(str);
				desktop.browse(url);
			} catch (IllegalArgumentException iae) {
				System.out.println("File Not Found");
			} 
			catch(IOException e) {
				System.out.println(str);
			} catch (URISyntaxException e) {
				System.out.println(str);
			}
			catch (NullPointerException e) {
				System.out.println(str);
			}
		}

}
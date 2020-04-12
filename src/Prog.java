/*
 * I had to scan the network folders in my organization to see which folders the user could access.
 * I could use the existing software but i wanted to build one myself.
 * Originally in the program ran serial (each IP at a time) but due to the great time of running I learned Multithreading independently
 * and thus significantly shortened the time.
 */

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;

public class Prog {

	public static void main(String[] args)
			throws IOException, URISyntaxException {
		ArrayList<String> arr = new ArrayList<String>();
		for (int a = 0; a < 256; a++) {
			for (int b = 0; b < 256; b++) {
				for (int c = 0; c <= 255; c++) {
					for (int d = 0; d <= 255; d++) {
						arr.add("file://" + a + "." + b +"." + c + "." + b);
					}
				}
			}
		}

		for (int i = 0; i < arr.size(); i++) {
			(new myOpen(arr.get(i))).run();
		}
		System.out.println("The program finished successfully!");
	}
}
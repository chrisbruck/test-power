import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		try {
			run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void run() throws IOException {
		
		String csvFile = "./namen.csv/";

		// oeffnet ne Verbindung zu dem file;
		FileInputStream f = new FileInputStream(csvFile);

		// inputstreamreader macht bytes zu characters
		InputStreamReader i = new InputStreamReader(f);

		// der buffered reader liest text aus m character stream
		BufferedReader in = new BufferedReader(i);

		// arraylist erstellen
		List<String> lines = new ArrayList<>();

		String line = null;
		while ((line = in.readLine()) != null) {
			
			lines.add(line);

			System.out.println(line);
		}
		in.close();
	}

}

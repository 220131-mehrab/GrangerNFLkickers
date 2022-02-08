import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

class KickerApp {

	public static void main(String[] args) throws Exception {

		File kickFile = new File("Career_Stats_Field_Goal_Kickers.csv");
		Scanner sc =  new Scanner(kickFile);
		sc.useDelimiter("\n");
		while (sc.hasNext()) {
			System.out.println(sc.next());
		}
	}
}

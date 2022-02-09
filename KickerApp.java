import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

class KickerApp {

	public static void main(String[] args) throws Exception {

		File kickFile = new File("Career_Stats_Field_Goal_Kickers.csv");
		Scanner sc =  new Scanner(kickFile);
		sc.useDelimiter("\n");
		sc.next();
		while (sc.hasNext()) {
		//	System.out.println(sc.next());
			String kickerRaw = sc.next();
			String[] kickerArray = kickerRaw.split(",");
			if (kickerArray[9].equals(args[0])) {
				System.out.println(kickerArray[1]+kickerArray[2]+kickerArray[4]+kickerArray[5]+kickerArray[9]);
			}
		}
	}
}

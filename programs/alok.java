import java.io.File;
import java.io.FileNotFoundException;
import java.text.NumberFormat;
import java.util.Scanner;

public class alok {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner s = new Scanner(new File("C:\\runfolder\\alok.dat"));
		
		double total=0;
		double count=0;
		
		while (s.hasNextLine()) {
			total += s.nextDouble();
			s.nextLine();
			count += 1;
		}
//		NumberFormat fmt = NumberFormat.getNumberInstance();
//		fmt.setMaximumFractionDigits(2);
//		fmt.setMinimumFractionDigits(2);
		
//		String r = fmt.format(total);
//		String q = fmt.format(total/count);
		
		System.out.println("$" + total);
		System.out.println("$" + total/count);
		
		s.close();
	}

}

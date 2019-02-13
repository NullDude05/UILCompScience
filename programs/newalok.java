import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class newalok{
	public static void main(String [] args) throws IOException
	{
		Scanner f = new Scanner(new File("C:\\runfolder\\alok.dat"));
		int count = 0;
		double sum = 0.0;
		while(f.hasNext()){
			sum+=f.nextDouble();
			count++;
		}
		double avg = sum/count;
		out.printf("$%.2f\n$%.2f\n",sum,avg);
	}
}
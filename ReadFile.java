package invitationalA;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFile {

	public static void main(String[] args) {
		String file = "/Users/NguyenMac/Documents/workspace/Comp Sci UIL 2018-2019/Comp Sci UIL State 2017/src/invitationalA/abdul2.txt";
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			String line;
			
			while ((line = br.readLine()) != null) {
				int output = Integer.valueOf(line) * Integer.valueOf(line);
				System.out.println(output);
			}
			
			br.close();
			
		} catch (IOException e) {
			System.out.println("ERROR: Cannot read file!");
			e.printStackTrace();
		}

	}

}

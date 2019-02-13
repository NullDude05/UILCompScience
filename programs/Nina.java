import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Nina {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner s = new Scanner(new File("C:\\runfolder\\nina.dat"));
		int loc = 0;
		
		int e = s.nextInt();
		
		for(int i=0; i<e; i++) {
			s.nextLine();
			double rad = s.nextDouble();
			
			double side = 2 * rad * Math.sin(Math.PI/5);
			
			double area = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI/5));
			
			//System.out.println(side);
			
			double aSide = side * 500;
			
			//System.out.println(aSide * 5);
			
			int bSide = (int)Math.round(aSide);
			
			//System.out.println(bSide);
			
			double cSide = bSide;
			
			//System.out.println(cSide/100);
			
			//********************
			
			double aArea = area * 100;
			
			//System.out.println(aSide * 5);
			
			int bArea = (int)Math.round(aArea);
			
			//System.out.println(bSide);
			
			double cArea = bArea;
			
			//System.out.println(cArea/100);
			
			//*****
			
			//double newSide = Math.round(side * 100) / 100;
			
			
			//System.out.println(area);
			
			loc++;
			
			System.out.print("LOCATION #" + loc);
			
			if(cArea<4356000) {
				System.out.print(" " + cArea / 100);
				System.out.println(" " + cSide / 100);
			}else{
				System.out.println(" WILL NOT FIT");
			}	

					
		}
		
		s.close();
		

	}

}

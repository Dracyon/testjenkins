package testjenkins;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello jenkins");
		File src = new File ("/Users/wkowalczyk/Documents/workspace/MantaTesting/Files/Orginal/Binsy/");
		File dest = new File ("/Users/wkowalczyk/Documents/workspace/testjenkins/Binsy/serio");
		try {
			FileUtils.copyDirectory(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		PrintWriter out = null;
//		try {
//			out = new PrintWriter("BinsyErrorPathListBL.txt");
//		} catch (FileNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		try {
//			FileInputStream fis = new FileInputStream("test.txt");
//			BufferedReader fisReader = new BufferedReader(new InputStreamReader(fis));
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
		
		
	}
		

}

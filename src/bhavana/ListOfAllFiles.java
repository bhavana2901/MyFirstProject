package bhavana;

import java.io.File;

public class ListOfAllFiles {

	public static void main(String[] args) {
		File myfile = new File("C:\\");
		String[] filelist = myfile.list();
		for(String name:filelist)
			System.out.println(name);
			

	}

}

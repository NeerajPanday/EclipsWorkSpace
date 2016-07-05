package com.neeraj;

import java.io.FileWriter;
import java.io.IOException;

public class Lab4 {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("E:\\neerajpandey2",true);
          fw.write(99);
          fw.write("Neeraj \n Kumar Pandey");
          fw.write('\n');
	char [] ch={'a','b','c'};
	fw.write(ch);
	fw.flush();
	fw.close();
	
	
	}

}

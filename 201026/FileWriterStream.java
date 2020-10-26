package io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterStream {

	public static void main(String[] args) throws IOException {
		
		Writer out = new FileWriter("papaer.txt");
		
		//out.write('A');	// char -> int (자동 형변환)
		//out.write('B');
		out.append('C');
		
		
		out.close();
		System.out.println("파일이 생성되었습니다.");
		
		
		
		
	}
}

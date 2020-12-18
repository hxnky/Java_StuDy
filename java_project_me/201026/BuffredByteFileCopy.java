package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BuffredByteFileCopy {
	// FileNotFoundException은 IOException을 상속하고있어서 오류 발생하지 않음
	public static void main(String[] args) throws IOException {

		// 읽어올 파일의 InputStream 인스턴스 생성
		InputStream in = new FileInputStream("org.pdf");
		// 출력 파일의 outputStream 인스턴스 생성
		// 해당 경로의 파일이 존재하지 않으면 파일을 생성해서 write
		// 해당 경로에 파일이 존재하면 덮어쓴다.
		OutputStream out = new FileOutputStream("org_copy.pdf");

		// 필터스트림 인스턴스 생성
		BufferedInputStream bin = new BufferedInputStream(in, 1024);
		BufferedOutputStream bout = new BufferedOutputStream(out, 1024);

		int copyByte = 0; // 복사한 사이즈
		int bData = 0; // 복사한 byte 크기의 데이터

		// byte[] buf = new byte[1024]; // 1kb 버퍼 생성
		// int readlength = 0;

		System.out.println("복사를 시작합니다.");

		while (true) {
			bData = in.read();
			// readlength = in.read(buf); // 더이상 가져올 데이터가 없으면 -1을 반환

			if (bData == -1) {
				// if (readlength == -1) {
				break;
			}
			out.write(bData); // 출력 : 파일에 바이너리 코드를 쓴다.
			// out.write(buf, 0, readlength);
			copyByte++;
			// copyByte += readlength; // 읽어온 개수만큼 반환
		}

		in.close(); // 스트림 인스턴스 소멸
		out.close();

		System.out.println("복사가 완료되었습니다.");
		System.out.println("복사된 사이즈 : " + copyByte + "byte 입니다.");

	}
}

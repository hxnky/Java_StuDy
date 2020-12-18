package basic;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		
		String strData = "cool:진:jin@gmail:서울:?";
		StringTokenizer st = new StringTokenizer(strData, ":");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		System.out.println("----------------------------");
		String pNum = "Tel 82-010-9999-7777 son";
		StringTokenizer st1 = new StringTokenizer(pNum);
		
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		
		StringTokenizer st2 = new StringTokenizer(pNum, " -");	// 구분자 "-". " "
		
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		
		StringTokenizer st3 = new StringTokenizer(pNum, "- ", true);
		
		while(st3.hasMoreTokens()) {
			System.out.println(st3.nextToken());
		}
		
		
		
		
		
		
	}
}

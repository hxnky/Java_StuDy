package com.aia.firstspring.Util;

import java.security.MessageDigest;

import org.springframework.stereotype.Component;

@Component	// 서비스와 컨트롤러 어노테이션과 마찬가지로 빈으로 등록해준다.
public class Sha256 {		// id를 따로 지정 안하면 "sha256"으로 지정된다.
	// 암호화 처리 클래스
	public String encrypt(String planText) {
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			md.update(planText.getBytes());
			byte byteData[] = md.digest();
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < byteData.length; i++) {
				sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
			}
			StringBuffer hexString = new StringBuffer();
			for (int i = 0; i < byteData.length; i++) {
				String hex = Integer.toHexString(0xff & byteData[i]);
				if (hex.length() == 1) {
					hexString.append('0');
				}
				hexString.append(hex);
			}
			return hexString.toString();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

}

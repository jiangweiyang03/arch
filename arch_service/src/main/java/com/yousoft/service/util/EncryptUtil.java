package com.yousoft.service.util;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

public class EncryptUtil implements PasswordEncoder {

	@Override
	public String encode(CharSequence rawPassword) {
		return encoder.encode(rawPassword);
	}

	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		return encoder.matches(rawPassword, encodedPassword);
	}

	// 从配置文件中获得
	private static final String SITE_WIDE_SECRET = "beibei";

	private static final PasswordEncoder encoder = new StandardPasswordEncoder(
			SITE_WIDE_SECRET);

	public static void main(String[] args) {
		EncryptUtil encryptUtil = new EncryptUtil();
		System.out.println(encryptUtil.matches("admin", "738a3a2652170e170691ba7e652d81a166b7123c348fd592ce31bde1421ab5be601ec59bef53448c"));
		
	}

}

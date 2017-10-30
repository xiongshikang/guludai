package com.guludai.ui.utils;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

public class PasswordHelper {
	/*private String algorithmName = "md5";
	private int hashIterations = 2;*/
	public static String encryptPassword(String password,String salt) {
		String newPassword = new SimpleHash("md5", password,  ByteSource.Util.bytes(salt), 2).toHex();
		return newPassword;
	}
	public static void main(String[] args) {
		System.out.println(PasswordHelper.encryptPassword("admin","admin"));
	}
	
	
}

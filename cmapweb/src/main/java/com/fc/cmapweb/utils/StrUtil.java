package com.fc.cmapweb.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class StrUtil {
	
	public static String getMD5Str(String str) {
		
		MessageDigest messageDigest = null;
		
		try {
			messageDigest = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

        StringBuilder buffer = new StringBuilder();

        if (null != messageDigest) {

            messageDigest.reset();
            messageDigest.update(str.getBytes());

            byte[] byteArray = messageDigest.digest();

            for (byte aByteArray : byteArray) {

                if (Integer.toHexString(0xFF & aByteArray).length() == 1) {
                    buffer.append("0").append(Integer.toHexString(0xFF & aByteArray));
                } else {
                    buffer.append(Integer.toHexString(0xFF & aByteArray));
                }

            }

        }

        return buffer.toString();
		
	}
	
	public static String bytesToHexString(byte[] src) {
		
	    StringBuilder stringBuilder = new StringBuilder();
	    
	    if (src == null || src.length <= 0) {
	    	return null;
	    }

        for (byte aSrc : src) {

            int v = aSrc & 0xFF;
            String hv = Integer.toHexString(v);

            if (hv.length() < 2) {
                stringBuilder.append(0);
            }

            stringBuilder.append(hv);

        }
	    
	    return stringBuilder.toString();
	    
	}
	
	public static byte[] hexStringToBytes(String hexString) {
		
	    if (hexString == null || hexString.equals("")) {
	        return null;
	    }
	    
	    hexString = hexString.toUpperCase();
	    int length = hexString.length() / 2;
	    char[] hexChars = hexString.toCharArray();
	    byte[] d = new byte[length];
	    
	    for (int i = 0; i < length; i++) {
	    	int pos = i * 2;  
	    	d[i] = (byte) (charToByte(hexChars[pos]) << 4 | charToByte(hexChars[pos + 1]));  
	    }
	    
	    return d;
	    
	}
	
	private static byte charToByte(char c) {
	    return (byte) "0123456789ABCDEF".indexOf(c);
	}
	
}

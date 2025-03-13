
package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.security.MessageDigest;

@Component
//public class MD5Util {
public class cs2 {
//    @Value("${user.password.salt}")
    private String SALT;

    public String encode(String password) {
        SALT="afdb34e0dc78";
        password ="xsadmin";
        password = password + SALT;
        MessageDigest md5;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        char[] charArray = password.toCharArray();
        byte[] byteArray = new byte[charArray.length];

        for (int i = 0; i < charArray.length; i++)
            byteArray[i] = (byte) charArray[i];
        byte[] md5Bytes = md5.digest(byteArray);
        StringBuilder hexValue = new StringBuilder();
        for (int i = 0; i < md5Bytes.length; i++) {
            int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16) {
                hexValue.append("0");
            }

            hexValue.append(Integer.toHexString(val));
        }
        return hexValue.toString();
    }

}
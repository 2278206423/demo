package com.example.demo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import sun.misc.BASE64Decoder;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;

@Component
public class cs {
//    @Value("${login.key}")
    private String KEY;
//    @Value("${login.iv}")
    private String IV;
     String cs(String  a){return a;}

    public String decrypt(String cipherStr, String EncryptMode) throws Exception {
      KEY="qeUlOJdw9TMR3VPc";
      IV="9953e9af88c8902e";
        EncryptMode="CBC";
        cipherStr="2daa7aac1ad4349dd742faef39cd1741";
//        if (StringUtils.isBlank(cipherStr)) {
//            return null;
//        }
        // 对于前端的密文要先base64解密
        BASE64Decoder decoder = new BASE64Decoder();
        IvParameterSpec iv = new IvParameterSpec(IV.getBytes());
        SecretKeySpec secretKey = new SecretKeySpec(KEY.getBytes(), "AES");
        try {
            Cipher cipher = Cipher.getInstance("AES/" + EncryptMode + "/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, secretKey, iv);
            String a=new String(cipher.doFinal(decoder.decodeBuffer(cipherStr)), StandardCharsets.UTF_8);
            return new String(cipher.doFinal(decoder.decodeBuffer(cipherStr)), StandardCharsets.UTF_8);
        } catch (Exception e) {
            throw new Exception("系统异常，请联系管理员");
        }
    }




}
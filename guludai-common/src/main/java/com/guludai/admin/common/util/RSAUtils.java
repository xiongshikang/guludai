package com.guludai.admin.common.util;

/**
 * 32位MD5摘要算法
 * @author heqiao
 * @date 2017-10-28 下午02:34:45
 */
import com.guludai.admin.common.rsa.Base64;
import com.guludai.admin.common.rsa.Base64Utils;

import javax.crypto.Cipher;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.*;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
//import org.springframework.util.StringUtils;

/**
 * Created by Administrator on 2017/10/15.
 */
public class RSAUtils {
    public static final String PRIVATE_KEY = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBALygImqRr1ueKL/eUoG4IjUjic59k0H26RSdqY5iTs4vLgkFjxH+I1mv7rk1wwMFCnh0B8G+VgF4cuiEEy1LV0KqSMfxPTXg8Di6g/llJ3H60PIibnD6fQkDC8XcCMXt8dubN5uSljY7wUXkAX121rCacIXRDDWkevpwqiuj/54lAgMBAAECgYBBzlwzccAL5pGw3o9KUkMc5tkdARJu4QVP+/E7i3CS3kLhQt83F8Kdd5OBahAu7YNJorFSFmVK/gqYs/s8whweu82P5UWXY/25gMkpVRiA1smkOkVpBOjd1gMelKxdkNnXDUhBKYMHMtijrxbQtsJrJCk7pRdYlxHgDHtDi7SkAQJBAPMWF8AfIGC8xmUFqbVml9iki3SOVdGzVGSs5RHB96vnhuD6WgJdwfBHBd8nPIGYR4PH7p0NkDxW8me11xi/FRECQQDGpWPYBThTtyWtEOs0euspCvTgpSFQW63S2Yq2cqvkn0rLcfFJO1AKoN9fYgx+ywTfQN38EU2kkzOV/rht9afVAkAOqYl7NCVu0FQjKclHwM1t6tbii+dPQ8LWY7tZa9q1iryO+2rMc71L8ey/vg0fQAEoSLnyzSujCBeM++HigzwRAkEAkl3Q+J24CC8dqqyZsdyUI3S4REJIDq7OoFq8U3yg3V7lvIvjTqNOcdZhYCWdsVsj5uAj8JRLUmVIEFBUUmk8VQJAHDYbD6ZbgIsvo+c2weVx2gnvbm5/PtlVVpMel0Rqj+4wjBPXx88lVjc4NTjUg0NUb9wfMJQ7fHluGJWXWROPKQ==";
    private static final String PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC8oCJqka9bnii/3lKBuCI1I4nOfZNB9ukUnamOYk7OLy4JBY8R/iNZr+65NcMDBQp4dAfBvlYBeHLohBMtS1dCqkjH8T014PA4uoP5ZSdx+tDyIm5w+n0JAwvF3AjF7fHbmzebkpY2O8FF5AF9dtawmnCF0Qw1pHr6cKoro/+eJQIDAQAB";

    /**
     * RSA最大加密明文大小
     */
    private static final int MAX_ENCRYPT_BLOCK = 117;

    /**
     * RSA最大解密密文大小
     */
    private static final int MAX_DECRYPT_BLOCK = 128;

    /**
     * 加密算法RSA
     */
    private static final String KEY_ALGORITHM = "RSA";

    /**
     * 生成公钥和私钥
     *
     * @throws Exception
     */
    public static void getKeys() throws Exception {
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
        keyPairGen.initialize(1024);
        KeyPair keyPair = keyPairGen.generateKeyPair();
        RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();
        RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();

        String publicKeyStr = getPublicKeyStr(publicKey);
        String privateKeyStr = getPrivateKeyStr(privateKey);

        System.out.println("公钥\r\n" + publicKeyStr);
        System.out.println("私钥\r\n" + privateKeyStr);
    }

    /**
     * 使用模和指数生成RSA公钥
     * 注意：【此代码用了默认补位方式，为RSA/None/PKCS1Padding，不同JDK默认的补位方式可能不同，如Android默认是RSA
     * /None/NoPadding】
     *
     * @param modulus  模
     * @param exponent 公钥指数
     * @return
     */
    public static RSAPublicKey getPublicKey(String modulus, String exponent) {
        try {
            BigInteger b1 = new BigInteger(modulus);
            BigInteger b2 = new BigInteger(exponent);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            RSAPublicKeySpec keySpec = new RSAPublicKeySpec(b1, b2);
            return (RSAPublicKey) keyFactory.generatePublic(keySpec);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 使用模和指数生成RSA私钥
     * 注意：【此代码用了默认补位方式，为RSA/None/PKCS1Padding，不同JDK默认的补位方式可能不同，如Android默认是RSA
     * /None/NoPadding】
     *
     * @param modulus  模
     * @param exponent 指数
     * @return
     */
    public static RSAPrivateKey getPrivateKey(String modulus, String exponent) {
        try {
            BigInteger b1 = new BigInteger(modulus);
            BigInteger b2 = new BigInteger(exponent);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            RSAPrivateKeySpec keySpec = new RSAPrivateKeySpec(b1, b2);
            return (RSAPrivateKey) keyFactory.generatePrivate(keySpec);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 公钥加密
     *
     * @param data
     * @return
     * @throws Exception
     */
    public static String encryptByPublicKey(String data) throws Exception {
        byte[] dataByte = data.getBytes();
        byte[] keyBytes = Base64Utils.decode(PUBLIC_KEY);
        X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
        Key publicK = keyFactory.generatePublic(x509KeySpec);
        // 对数据加密
        // Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(Cipher.ENCRYPT_MODE, publicK);
        int inputLen = dataByte.length;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int offSet = 0;
        byte[] cache;
        int i = 0;
        // 对数据分段加密
        while (inputLen - offSet > 0) {
            if (inputLen - offSet > MAX_ENCRYPT_BLOCK) {
                cache = cipher.doFinal(dataByte, offSet, MAX_ENCRYPT_BLOCK);
            } else {
                cache = cipher.doFinal(dataByte, offSet, inputLen - offSet);
            }
            out.write(cache, 0, cache.length);
            i++;
            offSet = i * MAX_ENCRYPT_BLOCK;
        }
        byte[] encryptedData = out.toByteArray();
        out.close();
        return Base64Utils.encode(encryptedData);
    }

    /**
     * 私钥解密
     *
     * @param data
     * @return
     * @throws Exception
     */
    public static String decryptByPrivateKey(String data) throws Exception {
        byte[] encryptedData = Base64Utils.decode(data);
        byte[] keyBytes = Base64Utils.decode(PRIVATE_KEY);
        PKCS8EncodedKeySpec pkcs8KeySpec = new PKCS8EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
        Key privateK = keyFactory.generatePrivate(pkcs8KeySpec);
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");

        cipher.init(Cipher.DECRYPT_MODE, privateK);
        int inputLen = encryptedData.length;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int offSet = 0;
        byte[] cache;
        int i = 0;
        // 对数据分段解密
        while (inputLen - offSet > 0) {
            if (inputLen - offSet > MAX_DECRYPT_BLOCK) {
                cache = cipher
                        .doFinal(encryptedData, offSet, MAX_DECRYPT_BLOCK);
            } else {
                cache = cipher
                        .doFinal(encryptedData, offSet, inputLen - offSet);
            }
            out.write(cache, 0, cache.length);
            i++;
            offSet = i * MAX_DECRYPT_BLOCK;
        }
        byte[] decryptedData = out.toByteArray();
        out.close();
        return new String(decryptedData);
    }

    /**
     * 获取模数和密钥
     *
     * @return
     */
    public static Map<String, String> getModulusAndKeys() {

        Map<String, String> map = new HashMap<String, String>();

        try {
            InputStream in = RSAUtils.class
                    .getResourceAsStream("/rsa.properties");
            Properties prop = new Properties();
            prop.load(in);

            String modulus = prop.getProperty("modulus");
            String publicKey = prop.getProperty("publicKey");
            String privateKey = prop.getProperty("privateKey");

            in.close();

            map.put("modulus", modulus);
            map.put("publicKey", publicKey);
            map.put("privateKey", privateKey);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return map;
    }

    /**
     * 从字符串中加载公钥
     *
     * @param publicKeyStr 公钥数据字符串
     * @throws Exception 加载公钥时产生的异常
     */
    public static PublicKey loadPublicKey(String publicKeyStr) throws Exception {
        try {
            byte[] buffer = Base64Utils.decode(publicKeyStr);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            X509EncodedKeySpec keySpec = new X509EncodedKeySpec(buffer);
            return (RSAPublicKey) keyFactory.generatePublic(keySpec);
        } catch (NoSuchAlgorithmException e) {
            throw new Exception("无此算法");
        } catch (InvalidKeySpecException e) {
            throw new Exception("公钥非法");
        } catch (NullPointerException e) {
            throw new Exception("公钥数据为空");
        }
    }

    /**
     * 从字符串中加载私钥<br>
     * 加载时使用的是PKCS8EncodedKeySpec（PKCS#8编码的Key指令）。
     *
     * @param privateKeyStr
     * @return
     * @throws Exception
     */
    public static PrivateKey loadPrivateKey(String privateKeyStr)
            throws Exception {
        try {
            byte[] buffer = Base64Utils.decode(privateKeyStr);
            // X509EncodedKeySpec keySpec = new X509EncodedKeySpec(buffer);
            PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(buffer);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            return (RSAPrivateKey) keyFactory.generatePrivate(keySpec);
        } catch (NoSuchAlgorithmException e) {
            throw new Exception("无此算法");
        } catch (InvalidKeySpecException e) {
            throw new Exception("私钥非法");
        } catch (NullPointerException e) {
            throw new Exception("私钥数据为空");
        }
    }

    //    RSA签名

    /**
     * 签名处理
     * @param prikeyvalue：私钥
     * @param sign_str：签名源内容
     * @return
     */
    public static String sign(String prikeyvalue, String sign_str)
    {
        try
        {
            PKCS8EncodedKeySpec priPKCS8 = new PKCS8EncodedKeySpec(
                    Base64.getBytesBASE64(prikeyvalue));
            KeyFactory keyf = KeyFactory.getInstance("RSA");
            PrivateKey myprikey = keyf.generatePrivate(priPKCS8);
            // 用私钥对信息生成数字签名
            java.security.Signature signet = java.security.Signature
                    .getInstance("MD5withRSA");
            signet.initSign(myprikey);
            signet.update(sign_str.getBytes("UTF-8"));
            byte[] signed = signet.sign(); // 对信息的数字签名
            return new String(org.apache.commons.codec.binary.Base64.encodeBase64(signed));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    } 

    /**
     * 签名验证
     * @param pubkeyvalue：公钥
     * @param oid_str：源签名串
     * @param signed_str：签名结果串
     * @return
     */
    public static boolean checksign(String pubkeyvalue, String oid_str,
                                    String signed_str)
    {
        try
        {
            X509EncodedKeySpec bobPubKeySpec = new X509EncodedKeySpec(
                    Base64.getBytesBASE64(pubkeyvalue));
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            PublicKey pubKey = keyFactory.generatePublic(bobPubKeySpec);
            byte[] signed = Base64.getBytesBASE64(signed_str);// 这是SignatureData输出的数字签�?
            java.security.Signature signetcheck = java.security.Signature
                    .getInstance("MD5withRSA");
            signetcheck.initVerify(pubKey);
            signetcheck.update(oid_str.getBytes("UTF-8"));
            return signetcheck.verify(signed);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }


    public static String getPrivateKeyStr(PrivateKey privateKey)
            throws Exception {
        return new String(Base64Utils.encode(privateKey.getEncoded()));
    }

    public static String getPublicKeyStr(PublicKey publicKey) throws Exception {
        return new String(Base64Utils.encode(publicKey.getEncoded()));
    }

/*    public static void main(String[] args){
        String encryptText = null;
        try {
            //通过公钥加密数据
            encryptText = RSAUtils.encryptByPublicKey("测试数据");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("加密的数据:" + encryptText);

        String text = null;
        try {
            text = RSAUtils.decryptByPrivateKey(encryptText);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("解密的数据:" + text);
    }*/
}

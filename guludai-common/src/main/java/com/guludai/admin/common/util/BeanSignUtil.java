package com.guludai.admin.common.util;
/**
 * Created by heqiao on 2017/10/15.
 */

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.guludai.admin.common.enums.SignTypeEnum;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BeanSignUtil {
    public static void main(String[] args) {
        //签名
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name" , "张三");
        jsonObject.put("sex" , "f");
        jsonObject.put("addr" , "上海");
        String billFrontRequestChannelKey = "12345";
        // 签名加签
        String sign= addSignMD5(jsonObject,billFrontRequestChannelKey);
        jsonObject.put("sign",sign);
        System.out.println(sign);


        //拦截修改
        //jsonObject.put("test","1234");


        JSONObject jsonObject1 = jsonObject;
        // 签名校验
        boolean checkSign = checkSign(jsonObject1.toString() ,  "" ,  billFrontRequestChannelKey , SignTypeEnum.MD5);
        System.out.println(checkSign);
    }

    public static String addSignMD5(JSONObject reqObj, String md5_key) {
        if (reqObj == null) {
            return "";
        }
        // 生成待签名串
        String sign_src = genSignData(reqObj);
        sign_src += "&key=" + md5_key;
        try {
            return Md5Algorithm11.getInstance().md5Digest(
                    sign_src.getBytes("utf-8"));
        } catch (Exception e) {
            return "";
        }
    }

    /**
     * 生成待签名串
     *
     * @param jsonObject
     * @return
     */
    public static String genSignData(JSONObject jsonObject) {
        StringBuffer content = new StringBuffer();

        // 按照key做首字母升序排列
        List<String> keys = new ArrayList<String>(jsonObject.keySet());
        Collections.sort(keys, String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < keys.size(); i++) {
            String key = (String) keys.get(i);
            if ("sign".equals(key)) {
                continue;
            }
            String value = jsonObject.getString(key);
            // 空串不参与签名
            if (isnull(value)) {
                continue;
            }
            content.append((i == 0 ? "" : "&") + key + "=" + value);

        }
        String signSrc = content.toString();
        if (signSrc.startsWith("&")) {
            signSrc = signSrc.replaceFirst("&", "");
        }
        return signSrc;
    }

    /**
     * str空判断
     *
     * @param str
     * @return
     */
    public static boolean isnull(String str) {
        if (null == str || str.equalsIgnoreCase("null") || str.equals("")) {
            return true;
        } else
            return false;
    }

    /**
     * 签名验证
     *
     * checkSign <br/>
     *
     * @author mencius
     * @param reqStr
     * @param rsa_public
     * @param md5_key
     * @param signTypeEnum MD5/RSA
     * @return
     * @since JDK 1.7
     */
    public static boolean checkSign(String reqStr, String rsa_public, String md5_key, SignTypeEnum signTypeEnum) {
        JSONObject reqObj = JSON.parseObject(reqStr);
        if (reqObj == null) {
            return false;
        }
        // 签名方式MD5
        if (SignTypeEnum.MD5.equals(signTypeEnum)) {
            return checkSignMD5(reqObj, md5_key);
            // 签名方式RSA
        } else {
            return checkSignRSA(reqObj, rsa_public);
        }
    }

    /**
     * RSA签名验证
     *
     * @param reqObj
     * @return
     */
    private static boolean checkSignRSA(JSONObject reqObj, String rsa_public) {

        if (reqObj == null) {
            return false;
        }
        String sign = reqObj.getString("sign");
        // 生成待签名串
        String sign_src = genSignData(reqObj);
        try {
            if (SingRSAUtil.checksign(rsa_public, sign_src, sign)) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * MD5签名验证
     *
     * @param reqObj
     * @param md5_key
     * @return
     */
    private static boolean checkSignMD5(JSONObject reqObj, String md5_key) {
        if (reqObj == null) {
            return false;
        }
        String sign = reqObj.getString("sign");
        // 生成待签名串
        String sign_src = genSignData(reqObj);
        sign_src += "&key=" + md5_key;
        try {
            String sing2 = Md5Algorithm11.getInstance().md5Digest(sign_src.getBytes("utf-8"));
            if (sign.equals(sing2)) {
                return true;
            } else {
                return false;
            }
        } catch (UnsupportedEncodingException e) {
            return false;
        }
    }
}

package com.lgx;


import com.apistd.uni.Uni;
import com.apistd.uni.UniException;
import com.apistd.uni.UniResponse;
import com.apistd.uni.sms.UniMessage;
import com.apistd.uni.sms.UniSMS;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

/**
 * @author LGX_TvT <br>
 * @version 1.0 <br>
 * Create by 2023-08-25 11:04 <br>
 * @description: SmsTest <br>
 */
public class SmsTest {

    public static String ACCESS_KEY_ID = "your access key id";
    private static String ACCESS_KEY_SECRET = "your access key secret";

    public static void main(String[] args) {
        // 初始化
        Uni.init(ACCESS_KEY_ID, null); // 若使用简易验签模式仅传入第一个参数即可

        // 设置自定义参数 (变量短信)
        Map<String, String> templateData = new HashMap<String, String>();
        templateData.put("code", "6666");

        // 构建信息
        UniMessage message = UniSMS.buildMessage()
                .setTo("18750712757")
                .setSignature("简意工具存放")
                .setTemplateId("pub_verif_basic2")
                .setTemplateData(templateData);

        // 发送短信
        try {
            UniResponse res = message.send();
            System.out.println(new Gson().toJson(res));
        } catch (UniException e) {
            System.out.println("Error: " + e);
            System.out.println("RequestId: " + e.requestId);
        }
    }

}

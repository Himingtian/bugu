package com.bugu.user.service.impl;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.bugu.user.service.RegisterService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

/**
 * Created by zhoumingtian on 2018-06-30
 */
@Service
public class RegisterServiceImpl implements RegisterService{

    private static final  Logger logger = LogManager.getLogger(RegisterServiceImpl.class);

    @Override
    public boolean sendSMSMessage(String mobile) {

        System.setProperty("sun.net.client.defaultConnectTimeout", "10000");
        System.setProperty("sun.net.client.defaultReadTimeout", "10000");

        final String product = "Dysmsapi";
        final String domain = "dysmsapi.aliyuncs.com";

        final String accessKeyId = "LTAIOYkEQK8flDBA";
        final String accessKeySecret = "Sv4T7CfoqsrV9UoNQDFMXQOaETDHEo";

        try{

            IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId,accessKeySecret);
            DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", product, domain);
            IAcsClient acsClient = new DefaultAcsClient(profile);
            //组装请求对象
            SendSmsRequest smsRequest = new SendSmsRequest();
            //待发送手机号
            smsRequest.setPhoneNumbers(mobile);
            //短信签名
            smsRequest.setSignName("TESTSMS");
            //短信模板
            smsRequest.setTemplateCode("SMS_138072639");

            int ran = (int)(Math.random()*(9999-1000+1))+1000;//产生1000-9999的随机数
            String code = String.valueOf(ran);
            smsRequest.setTemplateParam("{\"code\":"+code+"}");
            logger.info("短信验证, 验证手机:[{}] . 验证码:[{}]", mobile, code);
            SendSmsResponse sendSmsResponse = acsClient.getAcsResponse(smsRequest);
            if(sendSmsResponse.getCode() != null && sendSmsResponse.getCode().equals("OK")) {
                //请求成功
                System.out.print("success");
                return true;
            }
        }catch (ClientException e){
            return false;
        }
        return false;
    }
}

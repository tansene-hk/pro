package com.tansene.service;

import com.tansene.entity.SmsVerify;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 * 验证码发送记录 服务类
 * </p>
 *
 * @author tansene
 * @since 2020/11/22
 */
public interface ISmsVerifyService extends IService<SmsVerify> {

    /**
     * 根据手机号 验证码 和验证码类型查询
     * @param mobile 手机号
     * @param captcha 验证码
     * @param type 1：登录验证，2：注册验证，3：修改密码，4：修改账号
     * @return
     */
    List<SmsVerify> getByMobileAndCaptchaAndType(String mobile,String captcha,int type);

    SmsVerify addAndGetMobileAndCaptcha(String smsType, String mobile)throws Exception;

    void captchaCheck(String mobile,String smsType, String captcha)throws Exception;
}

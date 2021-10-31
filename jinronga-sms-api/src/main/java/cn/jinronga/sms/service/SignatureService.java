package cn.jinronga.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.jinronga.sms.entity.SignatureEntity;

/**
 * 签名表
 *
 * @author IT李老师
 *
 */
public interface SignatureService extends IService<SignatureEntity> {

    SignatureEntity getByCode(String signature);
}

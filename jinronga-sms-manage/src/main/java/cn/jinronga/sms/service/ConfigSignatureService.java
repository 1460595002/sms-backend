package cn.jinronga.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.jinronga.sms.dto.ConfigDTO;
import cn.jinronga.sms.entity.ConfigSignatureEntity;

/**
 * 配置—签名表
 */
public interface ConfigSignatureService extends IService<ConfigSignatureEntity> {

    void merge(ConfigDTO entity);
}

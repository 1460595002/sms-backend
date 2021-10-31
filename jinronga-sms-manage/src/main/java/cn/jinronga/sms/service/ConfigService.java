package cn.jinronga.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.jinronga.sms.dto.ConfigDTO;
import cn.jinronga.sms.entity.ConfigEntity;

/**
 * 配置表
 */
public interface ConfigService extends IService<ConfigEntity> {

    ConfigEntity getByName(String name);

    void getNewLevel(ConfigDTO entity);

    void sendUpdateMessage();
}

package cn.jinronga.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.jinronga.sms.entity.TemplateEntity;

/**
 * 模板表
 *
 * @author IT李老师
 *
 */
public interface TemplateService extends IService<TemplateEntity> {

    TemplateEntity getByCode(String template);
}

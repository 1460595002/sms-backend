package cn.jinronga.sms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.jinronga.sms.entity.ManualProcessEntity;
import cn.jinronga.sms.mapper.ManualProcessMapper;
import cn.jinronga.sms.service.ManualProcessService;
import org.springframework.stereotype.Service;

/**
 * 人工处理任务表
 *
 * @author IT李老师
 *
 */
@Service
public class ManualProcessServiceImpl extends ServiceImpl<ManualProcessMapper, ManualProcessEntity> implements ManualProcessService {

}

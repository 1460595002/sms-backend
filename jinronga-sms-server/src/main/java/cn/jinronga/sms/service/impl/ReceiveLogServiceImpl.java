package cn.jinronga.sms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.jinronga.sms.entity.ReceiveLogEntity;
import cn.jinronga.sms.mapper.ReceiveLogMapper;
import cn.jinronga.sms.service.ReceiveLogService;
import org.springframework.stereotype.Service;

/**
 * 接收日志表
 *
 * @author IT李老师
 *
 */
@Service
public class ReceiveLogServiceImpl extends ServiceImpl<ReceiveLogMapper, ReceiveLogEntity> implements ReceiveLogService {

}

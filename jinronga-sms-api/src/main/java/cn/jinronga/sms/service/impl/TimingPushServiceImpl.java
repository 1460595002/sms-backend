package cn.jinronga.sms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.jinronga.sms.entity.TimingPushEntity;
import cn.jinronga.sms.mapper.TimingPushMapper;
import cn.jinronga.sms.service.TimingPushService;
import org.springframework.stereotype.Service;

/**
 * 定时发送
 *
 * @author IT李老师
 *
 */
@Service
public class TimingPushServiceImpl extends ServiceImpl<TimingPushMapper, TimingPushEntity> implements TimingPushService {

}

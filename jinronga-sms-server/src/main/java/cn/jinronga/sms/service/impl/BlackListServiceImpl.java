package cn.jinronga.sms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.jinronga.sms.entity.BlackListEntity;
import cn.jinronga.sms.mapper.BlackListMapper;
import cn.jinronga.sms.service.BlackListService;
import org.springframework.stereotype.Service;

/**
 * 黑名单
 *
 * @author IT李老师
 *
 */
@Service
public class BlackListServiceImpl extends ServiceImpl<BlackListMapper, BlackListEntity> implements BlackListService {


}

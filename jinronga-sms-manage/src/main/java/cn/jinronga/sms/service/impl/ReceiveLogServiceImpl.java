package cn.jinronga.sms.service.impl;

import cn.jinronga.sms.vo.ReceiveLogVO;
import cn.jinronga.sms.vo.StatisticsCountVO;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.jinronga.sms.entity.ReceiveLogEntity;
import cn.jinronga.sms.mapper.ReceiveLogMapper;
import cn.jinronga.sms.service.ReceiveLogService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 接收日志表
 *
 * @author IT李老师
 *
 */
@Service
public class ReceiveLogServiceImpl extends ServiceImpl<ReceiveLogMapper, ReceiveLogEntity> implements ReceiveLogService {

    @Override
    public Page<ReceiveLogVO> pageLog(Page<ReceiveLogVO> page, Map<String, Object> params) {
        IPage<ReceiveLogVO> receiveLogVOPage = this.baseMapper.selectLogPage(page, params);
        page.setRecords(receiveLogVOPage.getRecords());
        return page;
    }

    @Override
    public List<StatisticsCountVO> top10(Map params) {
        return this.baseMapper.top10(params);
    }

    @Override
    public List<StatisticsCountVO> trend(Map params) {
        return this.baseMapper.trend(params);
    }

}

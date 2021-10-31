package cn.jinronga.sms.service;

import cn.jinronga.sms.vo.ReceiveLogVO;
import cn.jinronga.sms.vo.StatisticsCountVO;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import cn.jinronga.sms.entity.ReceiveLogEntity;

import java.util.List;
import java.util.Map;

/**
 * 接收日志表
 *
 * @author IT李老师
 *
 */
public interface ReceiveLogService extends IService<ReceiveLogEntity> {

    Page<ReceiveLogVO> pageLog(Page<ReceiveLogVO> page, Map<String, Object> params);

    List<StatisticsCountVO> top10(Map params);

    List<StatisticsCountVO> trend(Map params);
}

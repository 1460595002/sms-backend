package cn.jinronga.sms.service;

import cn.jinronga.sms.vo.MarketingStatisticsCountVO;
import cn.jinronga.sms.vo.SendLogPageVO;
import cn.jinronga.sms.vo.SendLogVO;
import cn.jinronga.sms.vo.StatisticsCountVO;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import cn.jinronga.sms.entity.SendLogEntity;

import java.util.List;
import java.util.Map;

/**
 * 日志表
 *
 * @author IT李老师
 *
 */
public interface SendLogService extends IService<SendLogEntity> {

    Page<SendLogVO> pageLog(Page<SendLogVO> page, Map<String, Object> params);

    List<StatisticsCountVO> trend(Map params);

    Page<StatisticsCountVO> countPage(Page<StatisticsCountVO> page, Map<String, Object> params);

    List<Map> countForConfig(Map params);

    List<Map> rateForConfig(Map params);

    MarketingStatisticsCountVO getMarketingCountByBusinessId(String id);

    Page<SendLogPageVO> sendLogPage(Page<SendLogPageVO> page, SendLogPageVO sendLogPageVO);
}

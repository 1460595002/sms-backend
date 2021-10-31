package cn.jinronga.sms.mapper;

import cn.jinronga.sms.vo.MarketingStatisticsCountVO;
import cn.jinronga.sms.vo.SendLogPageVO;
import cn.jinronga.sms.vo.SendLogVO;
import cn.jinronga.sms.vo.StatisticsCountVO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cn.jinronga.sms.entity.SendLogEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 发送日志
 */
@Repository
public interface SendLogMapper extends BaseMapper<SendLogEntity> {

    IPage<SendLogVO> selectLogPage(Page<SendLogVO> page, @Param("params") Map<String, Object> params);

    List<StatisticsCountVO> trend(@Param("params") Map params);

    IPage<StatisticsCountVO> countPage(Page<StatisticsCountVO> page, @Param("params") Map params);

    List<Map> countForConfig(@Param("params") Map params);

    MarketingStatisticsCountVO getMarketingCount(@Param("params") Map params);

    IPage<SendLogPageVO> sendLogPage(Page<SendLogPageVO> page, @Param("params") SendLogPageVO sendLogPageVO);
}

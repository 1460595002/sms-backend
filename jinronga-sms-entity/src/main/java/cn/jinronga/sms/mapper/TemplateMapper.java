package cn.jinronga.sms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cn.jinronga.sms.dto.TemplateDTO;
import cn.jinronga.sms.entity.TemplateEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 模板表
 */
@Repository
public interface TemplateMapper extends BaseMapper<TemplateEntity> {

    IPage<TemplateDTO> custom(Page<TemplateDTO> page, @Param("params") Map params);

    List<TemplateDTO> custom(@Param("params") Map params);
}

package cn.jinronga.sms.entity;

import cn.jinronga.sms.entity.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 配置—模板表
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("config_template")
@ApiModel(description = "配置—模板表")
public class ConfigTemplateEntity extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "配置主键")
    private String configId;

    @ApiModelProperty(value = "模板主键")
    private String templateId;

    @ApiModelProperty(value = "通道模板  可能为空")
    private String configTemplateCode;

    @ApiModelProperty(value = "备注")
    private String remark;

}

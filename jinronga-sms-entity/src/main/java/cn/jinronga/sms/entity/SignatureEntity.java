package cn.jinronga.sms.entity;

import cn.jinronga.sms.entity.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 签名表
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("signature")
@ApiModel(description = "签名表")
public class SignatureEntity extends BaseEntity {
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "签名名称")
	private String name;

	@ApiModelProperty(value = "签名编码")
	private String code;

	@ApiModelProperty(value = "签名内容")
	private String content;

	@ApiModelProperty(value = "备注")
	private String remark;

}

package com.shanjupay.merchant.api.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author: taibai
 * @date:2020/5/6
 */
@ApiModel(value = "MerchantDTO",description = "商户信息")
@Data
public class MerchantDTO implements Serializable {
    @ApiModelProperty("商户id")
    private Long id;

    @ApiModelProperty("商户名称")
    private String merchantName;

    @ApiModelProperty("企业编号")
    private String merchantNo;

    @ApiModelProperty("企业地址")
    private String merchantAddress;

    @ApiModelProperty("商户类型")
    private String merchantType;

    @ApiModelProperty("营业执照")
    private String businessLicensesImg;

    @ApiModelProperty("法人身份证正面照片")
    private String idCardFrontImg;

    @ApiModelProperty("法人身份证背面照片")
    private String idCardAfterImg;

    @ApiModelProperty("联系人姓名")
    private String username;

    @ApiModelProperty("联系人密码")
    private String password;

    @ApiModelProperty("联系人手机号")
    private String mobile;

    @ApiModelProperty("联系人地址")
    private String contactsAddress;

    @ApiModelProperty("审核状态")
    private String aduitStatus;

    @ApiModelProperty("租户ID")
    private Long tenantId;
}

package team.bishe.wms.bean;

import lombok.Data;

/**
 * 仓库库存信息
 */
@Data
public class Stock {
    private Integer goodsId;    //货物id
    private String goodsName;   //货物名称
    private String goodsSize;   //货物规格
    private String goodsType;   //货物类型
    private Double goodsValue;  //货物价值
    private Integer repositoryId;   //仓库id
    private Long number;        //库存数量
}

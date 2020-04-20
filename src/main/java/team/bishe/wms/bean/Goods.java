package team.bishe.wms.bean;

import lombok.Data;

/**
 * 货物信息类
 */
@Data
public class Goods {
    private Integer id;     //货物id
    private String name;    //货物名
    private String type;    //货物类型
    private String size;    //货物规格
    private Double value;   //货物价值
}

package team.bishe.wms.bean;

import lombok.Data;

import java.util.Date;

/**
 * 申请单信息类
 */
@Data
public class Application {

    private Integer id;     //申请单id

    private Integer cusId;    //客户id
    private String cusName;   //客户姓名
    private String goodsName;  //货物名称
    private String goodsType;  //货物类型
    private Long number;        //货物数量
    private String applicationDate;     //申请日期
    private Integer repositoryId;       //仓库id
    private String state;       //状态


}

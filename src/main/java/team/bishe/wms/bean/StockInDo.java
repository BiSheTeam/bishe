package team.bishe.wms.bean;

import lombok.Data;

import java.util.Date;

/**
 * 入库记录
 */
@Data
public class StockInDo {
    private Integer id;     //入库记录id
    private Integer cusId;      //客户id
    private String cusName;     //客户姓名
    private Integer goodsId;    //货物id
    private String goodsName;   //货物名称
    private Integer repositoryId;   //仓库id
    private Long number;        //入库数量
    private Date time;      //入库时间
    private Integer repositoryAdminId;  //入库仓管员

}

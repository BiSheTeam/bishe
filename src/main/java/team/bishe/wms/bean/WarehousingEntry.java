package team.bishe.wms.bean;

import lombok.Data;

import java.util.Date;

/**
 * 入库单
 */
@Data
public class WarehousingEntry {
    private String  id;     //入库单id(单号)
    private Integer customerId; //客户id
    private String customerName;   //客户姓名
    private String goodsName;  //货物名称
    private String goodsType;  //货物类型
    private Long number;        //货物数量
    private String applicationDate;     //申请日期
    private Integer repositoryId;       //仓库id

    private String accountMan;  //结算员id
    private String time;  //入库时间
    private Double storageCost;
    private Double laborCost;    //人工费用
    private Double otherCost;   //其他费用
    private Double totalCost;   //总费用
    private Double payment;     //支付费用
    private String status;      //入库单状态
}

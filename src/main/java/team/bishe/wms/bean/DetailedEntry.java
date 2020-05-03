package team.bishe.wms.bean;

import lombok.Data;

import java.util.Date;

/**
 * 详细入库单
 */
@Data
public class DetailedEntry {
    private Integer detailedEntryId;    //单号
    private Integer customerId; //客户id
    private String customerName;
    private String pallet;  //托盘
    private String goodsName;  //货物名
    private String goodsSize;  //货物规格
    private Integer checkerId;  //验货员id
    private Integer storekeeperId; //仓管员id；
    private Long initialNumber;     //初始数量
    private Long currentNumber;  //当前数量
    private String intime;      //入库时间
    private Integer repositoryId;  //仓库id
    private String LastTime;      //最后操作时间
    private Integer applicationId;  //申请单号
}

package team.bishe.wms.bean;

import lombok.Data;

import java.util.Date;

/**
 * 详细入库单
 */
@Data
public class DetailedEntry {
    private Integer id;    //单号
    private Integer customerId; //客户id
    private String pallet;  //托盘
    private Integer checkerId;  //验货员id
    private Integer storekeeperId; //仓管员id；
    private String goodsName;  //货物名
    private String goodsSize;  //货物规格
    private Long initialNumber;     //初始数量
    private Long currentNumber;  //当前数量
    private Date time;      //入库时间
    private Integer repositoryId;  //仓库id
    private Date LastTime;      //最后操作时间

}

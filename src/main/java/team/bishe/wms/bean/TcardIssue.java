package team.bishe.wms.bean;

/**
 * @ClassName TcardIssue
 * @Description 卡档制卡信息表
 * @Author RJ
 * @Date 2020/4/8 11:43
 * @Version 1.0
 **/
public class TcardIssue {
    /*
     * 发卡机构
     **/
    private String  brhId;
    /*
     * 卡号
     **/
    private String  cardId;
    /*
     * 品牌代码
     **/
    private String  brandId;
    /*
     * 批次号
     **/
    private String  batchId;

    public String getBrhId() {
        return brhId;
    }

    public void setBrhId(String brhId) {
        this.brhId = brhId;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }
}

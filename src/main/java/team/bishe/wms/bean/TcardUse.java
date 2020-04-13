package team.bishe.wms.bean;

/**
 * @ClassName TcardUse
 * @Description
 * @Author RJ
 * @Date 2020/4/9 21:31
 * @Version 1.0
 **/
public class TcardUse {
    /**
     * 起始卡号
     */
    private String  startId;
    /**
     * 截止卡号
     */
    private String  endId;
    /**
     *卡状态
     */
    private String  sta;
    /**
     *卡标志（实体卡）
     */
    private String  flag;
    /**
     *卡描述
     */
    private String  cardDesc;
    /**
     *最后修改操作员id
     */
    private String  lastUpdOprId;
    /**
     *最后修改时间
     */
    private String  lastUpdTs;
    /**
     *卡数量
     */
    private Integer count;

    public String getStartId() {
        return startId;
    }

    public void setStartId(String startId) {
        this.startId = startId;
    }

    public String getEndId() {
        return endId;
    }

    public void setEndId(String endId) {
        this.endId = endId;
    }

    public String getSta() {
        return sta;
    }

    public void setSta(String sta) {
        this.sta = sta;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getCardDesc() {
        return cardDesc;
    }

    public void setCardDesc(String cardDesc) {
        this.cardDesc = cardDesc;
    }

    public String getLastUpdOprId() {
        return lastUpdOprId;
    }

    public void setLastUpdOprId(String lastUpdOprId) {
        this.lastUpdOprId = lastUpdOprId;
    }

    public String getLastUpdTs() {
        return lastUpdTs;
    }

    public void setLastUpdTs(String lastUpdTs) {
        this.lastUpdTs = lastUpdTs;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}

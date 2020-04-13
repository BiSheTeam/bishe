package team.bishe.wms.bean;

/**
 * @ClassName TcifCardMap
 * @Description 客户卡号绑定表
 * @Author RJ
 * @Date 2020/4/8 13:56
 * @Version 1.0
 **/
public class TcifCardMap {
    /*
     * 所属机构代码
     **/
    private String  brhId;
    /*
     * 客户编号
     **/
    private String  custId;
    /*
     *发卡机构代码
     **/
    private String  openBrhId;
    /*
     *卡号
     **/
    private String  cardId;
    /*
     *绑定日期
     **/
    private String  bindDt;
    /*
     *失效日期
     **/
    private String  expDt;
    /*
     *状态
     **/
    private String  sta;
    /*
     *最后修改机构代码
     **/
    private String  lastUpdBrhId;
    /*
     *最后修改操作员号
     **/
    private String  lastUpdOprId;
    /*
     *最后修改交易名
     **/
    private String  lastUpdTxnCd;
    /*
     *最后修改时刻
     **/
    private String  lastUpdTs;

    public String getBrhId() {
        return brhId;
    }

    public void setBrhId(String brhId) {
        this.brhId = brhId;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getOpenBrhId() {
        return openBrhId;
    }

    public void setOpenBrhId(String openBrhId) {
        this.openBrhId = openBrhId;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getBindDt() {
        return bindDt;
    }

    public void setBindDt(String bindDt) {
        this.bindDt = bindDt;
    }

    public String getExpDt() {
        return expDt;
    }

    public void setExpDt(String expDt) {
        this.expDt = expDt;
    }

    public String getSta() {
        return sta;
    }

    public void setSta(String sta) {
        this.sta = sta;
    }

    public String getLastUpdBrhId() {
        return lastUpdBrhId;
    }

    public void setLastUpdBrhId(String lastUpdBrhId) {
        this.lastUpdBrhId = lastUpdBrhId;
    }

    public String getLastUpdOprId() {
        return lastUpdOprId;
    }

    public void setLastUpdOprId(String lastUpdOprId) {
        this.lastUpdOprId = lastUpdOprId;
    }

    public String getLastUpdTxnCd() {
        return lastUpdTxnCd;
    }

    public void setLastUpdTxnCd(String lastUpdTxnCd) {
        this.lastUpdTxnCd = lastUpdTxnCd;
    }

    public String getLastUpdTs() {
        return lastUpdTs;
    }

    public void setLastUpdTs(String lastUpdTs) {
        this.lastUpdTs = lastUpdTs;
    }
}

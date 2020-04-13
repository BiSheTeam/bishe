package team.bishe.wms.bean;

/**
 * @ClassName TpidBasic
 * @Description 证件信息表
 * @Author RJ
 * @Date 2020/4/8 14:08
 * @Version 1.0
 **/
public class TpidBasic {
    /*
     * 发卡机构号
     **/
    private String  openBrhId ;
    /*
     *卡号
     **/
    private String  cardId;
    /*
     *证件类型
     **/
    private String  pidType;
    /*
     *证件号码
     **/
    private String  pidCd;
    /*
     *持证人姓名
     **/
    private String  pidName;
    /*
     *证件有效开始日期
     **/
    private String  pidStartDt;
    /*
     *证件有效结束日期
     **/
    private String  pidEndDt;
    /*
     *备用
     **/
    private String  miscTxt;
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

    public String getPidType() {
        return pidType;
    }

    public void setPidType(String pidType) {
        this.pidType = pidType;
    }

    public String getPidCd() {
        return pidCd;
    }

    public void setPidCd(String pidCd) {
        this.pidCd = pidCd;
    }

    public String getPidName() {
        return pidName;
    }

    public void setPidName(String pidName) {
        this.pidName = pidName;
    }

    public String getPidStartDt() {
        return pidStartDt;
    }

    public void setPidStartDt(String pidStartDt) {
        this.pidStartDt = pidStartDt;
    }

    public String getPidEndDt() {
        return pidEndDt;
    }

    public void setPidEndDt(String pidEndDt) {
        this.pidEndDt = pidEndDt;
    }

    public String getMiscTxt() {
        return miscTxt;
    }

    public void setMiscTxt(String miscTxt) {
        this.miscTxt = miscTxt;
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

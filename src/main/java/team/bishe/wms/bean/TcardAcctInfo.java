package team.bishe.wms.bean;

/**
 * @ClassName TcardAcctInfo
 * @Description 卡账户余额
 * @Author RJ
 * @Date 2020/4/8 15:44
 * @Version 1.0
 **/
public class TcardAcctInfo {
    /*
     * 机构号
     **/
    private String  brhId;
    /*
     *卡号
     **/
    private String  cardId;
    /*
     *账户号
     **/
    private String  acctId;
    /*
     *产品号
     **/
    private String  prdtNo;
    /*
     *更新日期
     **/
    private String  updateDt;
    /*
     *账户余额
     **/
    private Integer  currBalAt;
    /*
     *可用余额
     **/
    private Integer currAvailAt;
    /*
     *备用
     **/
    private String  bak;

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

    public String getAcctId() {
        return acctId;
    }

    public void setAcctId(String acctId) {
        this.acctId = acctId;
    }

    public String getPrdtNo() {
        return prdtNo;
    }

    public void setPrdtNo(String prdtNo) {
        this.prdtNo = prdtNo;
    }

    public String getUpdateDt() {
        return updateDt;
    }

    public void setUpdateDt(String updateDt) {
        this.updateDt = updateDt;
    }

    public Integer getCurrBalAt() {
        return currBalAt;
    }

    public void setCurrBalAt(Integer currBalAt) {
        this.currBalAt = currBalAt;
    }

    public Integer getCurrAvailAt() {
        return currAvailAt;
    }

    public void setCurrAvailAt(Integer currAvailAt) {
        this.currAvailAt = currAvailAt;
    }

    public String getBak() {
        return bak;
    }

    public void setBak(String bak) {
        this.bak = bak;
    }
}

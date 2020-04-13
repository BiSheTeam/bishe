package team.bishe.wms.bean;

/**
 * @ClassName TprdtInfo
 * @Description 卡产品信息表
 * @Author RJ
 * @Date 2020/4/8 11:20
 * @Version 1.0
 **/
public class TprdtInfo {
    /*
     * 机构号
     **/
    private String  brhId;
    /*
     *产品编号
     **/
    private String  prdtNo;
    /*
     *产品名称
     **/
    private String  prdtTitle;
    /*
     *产品描述
     **/
    private String  prdtDesc;
    /*
     *产品单位
     **/
    private String  prdtUnit;
    /*
     *启用日期
     **/
    private String  beginDt;
    /*
     *止用日期
     **/
    private String  endDT;
    /*
     *产品状态
     **/
    private String  sta;
    /*
     *产品类型
     **/
    private String  prdtType;
    /*
     *币种
     **/
    private String  curType;
    /*
     *余额类型
     **/
    private String  balType;
    /*
     *发生额类型
     **/
    private String  amtType;
    /*
     *有效期类型
     **/
    private String  validDateType;
    /*
     *有效期限类型
     **/
    private String  validTermType;
    /*
     *有效日期
     **/
    private String  validTermDate;
    /*
     *最低充值金额
     **/
    private Integer  minDepAmt;
    /*
     *最高充值金额
     **/
    private Integer  maxDepAmt;
    /*
     *最低消费金额
     **/
    private Integer  minPerAmt;
    /*
     *最高消费金额
     **/
    private Integer  maxPerAmt;
    /*
     *最高金额
     **/
    private Integer  maxBal;
    /*
     *允许透支标志
     **/
    private String  odFlg;
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

    public String getPrdtNo() {
        return prdtNo;
    }

    public void setPrdtNo(String prdtNo) {
        this.prdtNo = prdtNo;
    }

    public String getPrdtTitle() {
        return prdtTitle;
    }

    public void setPrdtTitle(String prdtTitle) {
        this.prdtTitle = prdtTitle;
    }

    public String getPrdtDesc() {
        return prdtDesc;
    }

    public void setPrdtDesc(String prdtDesc) {
        this.prdtDesc = prdtDesc;
    }

    public String getPrdtUnit() {
        return prdtUnit;
    }

    public void setPrdtUnit(String prdtUnit) {
        this.prdtUnit = prdtUnit;
    }

    public String getBeginDt() {
        return beginDt;
    }

    public void setBeginDt(String beginDt) {
        this.beginDt = beginDt;
    }

    public String getEndDT() {
        return endDT;
    }

    public void setEndDT(String endDT) {
        this.endDT = endDT;
    }

    public String getSta() {
        return sta;
    }

    public void setSta(String sta) {
        this.sta = sta;
    }

    public String getPrdtType() {
        return prdtType;
    }

    public void setPrdtType(String prdtType) {
        this.prdtType = prdtType;
    }

    public String getCurType() {
        return curType;
    }

    public void setCurType(String curType) {
        this.curType = curType;
    }

    public String getBalType() {
        return balType;
    }

    public void setBalType(String balType) {
        this.balType = balType;
    }

    public String getAmtType() {
        return amtType;
    }

    public void setAmtType(String amtType) {
        this.amtType = amtType;
    }

    public String getValidDateType() {
        return validDateType;
    }

    public void setValidDateType(String validDateType) {
        this.validDateType = validDateType;
    }

    public String getValidTermType() {
        return validTermType;
    }

    public void setValidTermType(String validTermType) {
        this.validTermType = validTermType;
    }

    public String getValidTermDate() {
        return validTermDate;
    }

    public void setValidTermDate(String validTermDate) {
        this.validTermDate = validTermDate;
    }

    public Integer getMinDepAmt() {
        return minDepAmt;
    }

    public void setMinDepAmt(Integer minDepAmt) {
        this.minDepAmt = minDepAmt;
    }

    public Integer getMaxDepAmt() {
        return maxDepAmt;
    }

    public void setMaxDepAmt(Integer maxDepAmt) {
        this.maxDepAmt = maxDepAmt;
    }

    public Integer getMinPerAmt() {
        return minPerAmt;
    }

    public void setMinPerAmt(Integer minPerAmt) {
        this.minPerAmt = minPerAmt;
    }

    public Integer getMaxPerAmt() {
        return maxPerAmt;
    }

    public void setMaxPerAmt(Integer maxPerAmt) {
        this.maxPerAmt = maxPerAmt;
    }

    public Integer getMaxBal() {
        return maxBal;
    }

    public void setMaxBal(Integer maxBal) {
        this.maxBal = maxBal;
    }

    public String getOdFlg() {
        return odFlg;
    }

    public void setOdFlg(String odFlg) {
        this.odFlg = odFlg;
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

package team.bishe.wms.bean;

/**
 * @ClassName TcardDoc
 * @Description 卡档信息表
 * @Author RJ
 * @Date 2020/4/8 11:49
 * @Version 1.0
 **/
public class TcardDoc {
    /*
     * 发卡机构
     **/
    private String  brhId;
    /*
     * 制卡申请批次号
     **/
    private Integer  docAppId;
    /*
     *申请操作员
     **/
    private String  appOprId;
    /*
     *申请日期
     **/
    private String  appDt;
    /*
     *审核操作员
     **/
    private String  auditOprId;
    /*
     *卡品牌
     **/
    private String  brandId;
    /*
     *卡品牌名称
     **/
    private String  brandNm;
    /*
     *卡类型
     **/
    private String  cardType;
    /*
     *起始卡号
     **/
    private String  startId;
    /*
     *终止卡号
     **/
    private String  endId;
    /*
     *制卡数量
     **/
    private Integer  cardCnt;
    /*
     *卡片面值
     **/
    private Integer  value;
    /*
     *有效期长度
     **/
    private Integer  effTerm;
    /*
     *卡片总金额
     **/
    private Integer  totValue;
    /*
     *有效起始日期
     **/
    private String  startDt;
    /*
     *有效截止日期
     **/
    private String  endDt;
    /*
     *支付方式
     **/
    private String  payMo;
    /*
     *制卡机构
     **/
    private String  cardBrhId;
    /*
     *标识
     **/
    private String  flag;
    /*
     *状态
     **/
    private String  stat;
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

    public Integer getDocAppId() {
        return docAppId;
    }

    public void setDocAppId(Integer docAppId) {
        this.docAppId = docAppId;
    }

    public String getAppOprId() {
        return appOprId;
    }

    public void setAppOprId(String appOprId) {
        this.appOprId = appOprId;
    }

    public String getAppDt() {
        return appDt;
    }

    public void setAppDt(String appDt) {
        this.appDt = appDt;
    }

    public String getAuditOprId() {
        return auditOprId;
    }

    public void setAuditOprId(String auditOprId) {
        this.auditOprId = auditOprId;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getBrandNm() {
        return brandNm;
    }

    public void setBrandNm(String brandNm) {
        this.brandNm = brandNm;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

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

    public Integer getCardCnt() {
        return cardCnt;
    }

    public void setCardCnt(Integer cardCnt) {
        this.cardCnt = cardCnt;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getEffTerm() {
        return effTerm;
    }

    public void setEffTerm(Integer effTerm) {
        this.effTerm = effTerm;
    }

    public Integer getTotValue() {
        return totValue;
    }

    public void setTotValue(Integer totValue) {
        this.totValue = totValue;
    }

    public String getStartDt() {
        return startDt;
    }

    public void setStartDt(String startDt) {
        this.startDt = startDt;
    }

    public String getEndDt() {
        return endDt;
    }

    public void setEndDt(String endDt) {
        this.endDt = endDt;
    }

    public String getPayMo() {
        return payMo;
    }

    public void setPayMo(String payMo) {
        this.payMo = payMo;
    }

    public String getCardBrhId() {
        return cardBrhId;
    }

    public void setCardBrhId(String cardBrhId) {
        this.cardBrhId = cardBrhId;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
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

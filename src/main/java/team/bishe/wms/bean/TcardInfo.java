package team.bishe.wms.bean;

import java.util.Date;

/**
 * @ClassName TcardInfo
 * @Description 卡信息表
 * @Author RJ
 * @Date 2020/4/8 10:51
 * @Version 1.0
 **/
public class TcardInfo {
    /*
     * 发卡机构号
     **/
    private String brhId;
    /*
     * 卡号
     **/
    private String cardId;
    /*
     * 卡品牌
     **/
    private String brandId;
    /*
     * 购卡单位
     **/
    private String buyBrhId;
    /*
     * 卡状态
     **/
    private String cardSta;
    /*
     * 激活日期
     **/
    private String startDt;
    /*
     * 有效截止日期
     **/
    private String  endDt;
    /*
     * 销卡日期
     **/
    private String  clsDt;
    /*
     * 最后交易日期
     **/
    private String  lastTxnDt;
    /*
     * 最后修改机构代码
     **/
    private String  lastUpdBrhId;
    /*
     * 最后修改操作员号
     **/
    private String  lastUpdOprId;
    /*
     * 最后修改交易名
     **/
    private String  lastUpdTxnCd;
    /*
     * 最后修改时刻
     **/
    private String lastUpdTs;
    /*
     * 卡品牌名称
     **/
    private String brandNm;
    /*
     * 发卡机构名称
     **/
    private String  brhNm;
    /*
     * 持卡人姓名
     **/
    private String  pidNm;
    /*总记录数*/
    private Integer count;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getPidNm() {
        return pidNm;
    }

    public void setPidNm(String pidNm) {
        this.pidNm = pidNm;
    }

    public String getBrhNm() {
        return brhNm;
    }

    public void setBrhNm(String brhNm) {
        this.brhNm = brhNm;
    }

    public String getBrandNm() {
        return brandNm;
    }

    public void setBrandNm(String brandNm) {
        this.brandNm = brandNm;
    }

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

    public String getBuyBrhId() {
        return buyBrhId;
    }

    public void setBuyBrhId(String buyBrhId) {
        this.buyBrhId = buyBrhId;
    }

    public String getCardSta() {
        return cardSta;
    }

    public void setCardSta(String cardSta) {
        this.cardSta = cardSta;
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

    public String getClsDt() {
        return clsDt;
    }

    public void setClsDt(String clsDt) {
        this.clsDt = clsDt;
    }

    public String getLastTxnDt() {
        return lastTxnDt;
    }

    public void setLastTxnDt(String lastTxnDt) {
        this.lastTxnDt = lastTxnDt;
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

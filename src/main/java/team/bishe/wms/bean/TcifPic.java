package team.bishe.wms.bean;

/**
 * @ClassName TcifPic
 * @Description 客户图片信息表
 * @Author RJ
 * @Date 2020/4/8 13:17
 * @Version 1.0
 **/
public class TcifPic {
    /*
     * 主键
     **/
    private Integer  sq;
    /*
     * 所属机构代码
     **/
    private String  brhId;
    /*
     * 客户编号
     **/
    private String  custId;
    /*
     *  图片代码
     **/
    private String  picCode;
    /*
     * 图片地址
     **/
    private String  picAddr;
    /*
     * 备注信息
     **/
    private String  miscTxt;
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
    private String  lastUpdTs;

    public Integer getSq() {
        return sq;
    }

    public void setSq(Integer sq) {
        this.sq = sq;
    }

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

    public String getPicCode() {
        return picCode;
    }

    public void setPicCode(String picCode) {
        this.picCode = picCode;
    }

    public String getPicAddr() {
        return picAddr;
    }

    public void setPicAddr(String picAddr) {
        this.picAddr = picAddr;
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

package team.bishe.wms.bean;

/**
 * @ClassName TcifIdMap
 * @Description 客户号证件号对照表
 * @Author RJ
 * @Date 2020/4/8 13:31
 * @Version 1.0
 **/
public class TcifIdMap {
    /*
     * 所属机构代码
     **/
    private String  brhId;
    /*
     *客户编号
     **/
    private String  custId;
    /*
     *证件种类
     **/
    private String  pidType;
    /*
     *证件号
     **/
    private String  pidCd;
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

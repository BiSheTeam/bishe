package team.bishe.wms.bean;

/**
 * @ClassName PickForm
 * @Description 拣选货物单
 * @Author RJ
 * @Date 2020/4/11 15:13
 * @Version 1.0
 **/
public class PickForm {
    /**
     * @Description 货物单编号
     */
    private String  gFormId;
    /**
     * @Description 客户ID
     */
    private String  custId;
    /**
     * @Description 货物储位
     */
    private String  gPosId;
    /**
     * @Description 货物名称
     */
    private String  goodNm;
    /**
     * @Description 货物单位
     */
    private String  goodUnit;
    /**
     * @Description 货物数量
     */
    private Integer  goodNum;
    /**
     * @Description 拣货状态
     */
    private String  pickSta;
    /**
     * @Description 托盘ID
     */
    private String  trayId;
    /**
     * @Description 拣选方式
     */
    private String  pickMode;

    public String getgFormId() {
        return gFormId;
    }

    public void setgFormId(String gFormId) {
        this.gFormId = gFormId;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getgPosId() {
        return gPosId;
    }

    public void setgPosId(String gPosId) {
        this.gPosId = gPosId;
    }

    public String getGoodNm() {
        return goodNm;
    }

    public void setGoodNm(String goodNm) {
        this.goodNm = goodNm;
    }

    public String getGoodUnit() {
        return goodUnit;
    }

    public void setGoodUnit(String goodUnit) {
        this.goodUnit = goodUnit;
    }

    public Integer getGoodNum() {
        return goodNum;
    }

    public void setGoodNum(Integer goodNum) {
        this.goodNum = goodNum;
    }

    public String getPickSta() {
        return pickSta;
    }

    public void setPickSta(String pickSta) {
        this.pickSta = pickSta;
    }

    public String getTrayId() {
        return trayId;
    }

    public void setTrayId(String trayId) {
        this.trayId = trayId;
    }

    public String getPickMode() {
        return pickMode;
    }

    public void setPickMode(String pickMode) {
        this.pickMode = pickMode;
    }
}

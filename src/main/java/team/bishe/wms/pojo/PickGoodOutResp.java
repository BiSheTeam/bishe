package team.bishe.wms.pojo;

/**
 * @ClassName PickGoodOutResp
 * @Description
 * @Author RJ
 * @Date 2020/4/11 15:30
 * @Version 1.0
 **/
public class PickGoodOutResp {
    /*拣选单编号*/
    private String  gFormId;
    /*
     * 货物储位
     */
    private String  gPosId;
    /*
     *货物名称
     */
    private String  goodNm;
    /*
     *货物数量
     */
    private String  goodNum;
    /*
     *托盘Id
     */
    private String  TrayId;

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

    public String getGoodNum() {
        return goodNum;
    }

    public void setGoodNum(String goodNum) {
        this.goodNum = goodNum;
    }

    public String getTrayId() {
        return TrayId;
    }

    public void setTrayId(String trayId) {
        TrayId = trayId;
    }

    public String getgFormId() {
        return gFormId;
    }

    public void setgFormId(String gFormId) {
        this.gFormId = gFormId;
    }
}

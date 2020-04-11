package team.bishe.wms.pojo;

/**
 * @ClassName PickGoodInReq
 * @Description
 * @Author RJ
 * @Date 2020/4/11 16:11
 * @Version 1.0
 **/
public class PickGoodInReq {
    /*
     * 客户ID
     **/
    private String  custId;
    /*
     *拣选方式
     **/
    private String  pickMode;

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getPickMode() {
        return pickMode;
    }

    public void setPickMode(String pickMode) {
        this.pickMode = pickMode;
    }
}

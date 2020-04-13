package team.bishe.wms.pojo;

/**
 * @ClassName BusManagementReq
 * @Description 业务管理入口参数
 * @Author RJ
 * @Date 2020/4/10 18:18
 * @Version 1.0
 **/
public class BusManagementReq {
    /*
     *卡号
     **/
    private String  cardId;
    /*
     *客户编号
     **/
    private String  custId;
    /*
     *状态
     **/
    private String  sta;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getSta() {
        return sta;
    }

    public void setSta(String sta) {
        this.sta = sta;
    }
}

package team.bishe.wms.pojo;

/**
 * @ClassName CardSpecialReq
 * @Description
 * @Author RJ
 * @Date 2020/4/10 20:17
 * @Version 1.0
 **/
public class CardSpecialReq {
    /*
     *卡号
     **/
    private String  cardId;
    /*
     *备注
     **/
    private String  remark;
    /*
     *验证方式
     **/
    private String  verType;
    /*
     *验证数据
     **/
    private String  verData;
    /*
     *姓名
     **/
    private String  userName;
    /*
     *有效期
     **/
    private String  timeData;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getVerType() {
        return verType;
    }

    public void setVerType(String verType) {
        this.verType = verType;
    }

    public String getVerData() {
        return verData;
    }

    public void setVerData(String verData) {
        this.verData = verData;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTimeData() {
        return timeData;
    }

    public void setTimeData(String timeData) {
        this.timeData = timeData;
    }
}

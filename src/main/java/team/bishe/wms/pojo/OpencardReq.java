package team.bishe.wms.pojo;

/**
 * @ClassName OpencardReq
 * @Description 开卡入口参数
 * @Author RJ
 * @Date 2020/4/10 17:20
 * @Version 1.0
 **/
public class OpencardReq {
    /*
     * 卡号
     **/
    private String  cardId;
    /*
     * 姓名
     **/
    private String  userName;
    /*
     * 身份证号
     **/
    private String  idCardNo;
    /*
     * 手机号
     **/
    private String  mobile;
    /*
     * 起始卡号
     **/
    private String  startId;
    /*
     * 截止卡号
     **/
    private String  endId;
    /*
     * 开始日期
     **/
    private String startDt;

    public String getStartDt() {
        return startDt;
    }

    public void setStartDt(String startDt) {
        this.startDt = startDt;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
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
}

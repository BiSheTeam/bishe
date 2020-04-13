package team.bishe.wms.pojo;

/**
 * @ClassName MakeCardAppl
 * @Description 制卡申请请求参数
 * @Author RJ
 * @Date 2020/4/9 10:06
 * @Version 1.0
 **/
public class MakeCardAppl {
    /*
     * 卡号
     **/
    private String  mainBin;
    /*
     * 品牌号
     **/
    private String  branId;
    /*
     * 起始号码
     **/
    private String  startId;
    /*
     * 终止号码
     **/
    private String  endId;
    /*
     * 可用数量
     **/
    private String  count;
    /*
     * 卡片面值
     **/
    private String  cardAmt;
    /*
     * 有效期期限
     **/
    private String  effTerm;
    /*
     * 卡类型
     **/
    private String  cardType;

    public String getMainBin() {
        return mainBin;
    }

    public void setMainBin(String mainBin) {
        this.mainBin = mainBin;
    }

    public String getBranId() {
        return branId;
    }

    public void setBranId(String branId) {
        this.branId = branId;
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

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getCardAmt() {
        return cardAmt;
    }

    public void setCardAmt(String cardAmt) {
        this.cardAmt = cardAmt;
    }

    public String getEffTerm() {
        return effTerm;
    }

    public void setEffTerm(String effTerm) {
        this.effTerm = effTerm;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
}

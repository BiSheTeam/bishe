package team.bishe.wms.bean;

/**
 * @ClassName WgoodsInfo
 * @Description 货物信息表
 * @Author RJ
 * @Date 2020/4/8 16:09
 * @Version 1.0
 **/
public class WgoodsInfo {
    /*
     * 货物编号
     **/
    private String  goodId;
    /*
     *货物名称
     **/
    private String  goodNm;
    /*
     *货物单位
     **/
    private String  goodUnit;
    /*
     *货物规格
     **/
    private String  goodSpec;
    /*
     *货主名字
     **/
    private String  goodUser;
    /*
     *货主ID
     **/
    private String  goodUserId;
    /*
     *货物种类
     **/
    private String  type;
    /*
     *货物存放区域
     **/
    private String  region;
    /*
     *货物数量
     **/
    private Integer  number;
    /*
     *生产日期
     **/
    private String  dateProduct;
    /*
     *保质期
     **/
    private String  date;
    /*
     *货物储位
     **/
    private String  gPosId;

    public String getgPosId() {
        return gPosId;
    }

    public void setgPosId(String gPosId) {
        this.gPosId = gPosId;
    }

    public String getGoodId() {
        return goodId;
    }

    public void setGoodId(String goodId) {
        this.goodId = goodId;
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

    public String getGoodSpec() {
        return goodSpec;
    }

    public void setGoodSpec(String goodSpec) {
        this.goodSpec = goodSpec;
    }

    public String getGoodUser() {
        return goodUser;
    }

    public void setGoodUser(String goodUser) {
        this.goodUser = goodUser;
    }

    public String getGoodUserId() {
        return goodUserId;
    }

    public void setGoodUserId(String goodUserId) {
        this.goodUserId = goodUserId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getDateProduct() {
        return dateProduct;
    }

    public void setDateProduct(String dateProduct) {
        this.dateProduct = dateProduct;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

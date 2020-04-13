package team.bishe.wms.bean;

/**
 * @ClassName WareHouseInfo
 * @Description 仓库信息表
 * @Author RJ
 * @Date 2020/4/8 16:15
 * @Version 1.0
 **/
public class WareHouseInfo {
    /*
     * 仓库编号
     **/
    private String  whouseId;
    /*
     * 仓库名称
     **/
    private String  whouseNm;
    /*
     * 仓库属性
     **/
    private String  attribute;
    /*
     * 仓库条码
     **/
    private String  code;
    /*
     * 仓库类型
     **/
    private String  type;
    /*
     * 仓库状态
     **/
    private String  status;
    /*
     * 仓库面积
     **/
    private String  area;
    /*
     * 仓库管理员Id;
     **/
    private String  adminId;
    /*
     * 仓库仓库管理员名字
     **/
    private String  adminNm;
    /*
     * 仓库地址
     **/
    private String address;

    public String getWhouseId() {
        return whouseId;
    }

    public void setWhouseId(String whouseId) {
        this.whouseId = whouseId;
    }

    public String getWhouseNm() {
        return whouseNm;
    }

    public void setWhouseNm(String whouseNm) {
        this.whouseNm = whouseNm;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getAdminNm() {
        return adminNm;
    }

    public void setAdminNm(String adminNm) {
        this.adminNm = adminNm;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

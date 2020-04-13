package team.bishe.wms.bean;

/**
 * @ClassName WarePositionInfo
 * @Description 仓位信息表
 * @Author RJ
 * @Date 2020/4/8 16:30
 * @Version 1.0
 **/
public class WarePositionInfo {
    /*
     *  仓位编号
     **/
    private String  posId;
    /*
     *  仓位代码
     **/
    private String  posNum;
    /*
     *  仓位名称
     **/
    private String  posNm;
    /*
     *  所属仓库ID
     **/
    private String  whouseId;
    /*
     *  所属仓库名称
     **/
    private String  whouseNm;
    /*
     *  仓位状态
     **/
    private String  status;

    public String getPosId() {
        return posId;
    }

    public void setPosId(String posId) {
        this.posId = posId;
    }

    public String getPosNum() {
        return posNum;
    }

    public void setPosNum(String posNum) {
        this.posNum = posNum;
    }

    public String getPosNm() {
        return posNm;
    }

    public void setPosNm(String posNm) {
        this.posNm = posNm;
    }

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

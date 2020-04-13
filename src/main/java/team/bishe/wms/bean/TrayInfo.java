package team.bishe.wms.bean;

/**
 * @ClassName TrayInfo
 * @Description 托盘信息表
 * @Author RJ
 * @Date 2020/4/8 16:34
 * @Version 1.0
 **/
public class TrayInfo {
    /*
     *  托盘编号
     **/
    private String  trayNum;
    /*
     *  托盘ID
     **/
    private String  trayId;
    /*
     *  所属仓位名称
     **/
    private String  posNum;
    /*
     *  所属仓位ID
     **/
    private String  posId;
    /*
     *  托盘状态
     **/
    private String  status;
    /*
     *  RFID编号
     **/
    private String  rfidNum;

    public String getTrayNum() {
        return trayNum;
    }

    public void setTrayNum(String trayNum) {
        this.trayNum = trayNum;
    }

    public String getTrayId() {
        return trayId;
    }

    public void setTrayId(String trayId) {
        this.trayId = trayId;
    }

    public String getPosNum() {
        return posNum;
    }

    public void setPosNum(String posNum) {
        this.posNum = posNum;
    }

    public String getPosId() {
        return posId;
    }

    public void setPosId(String posId) {
        this.posId = posId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRfidNum() {
        return rfidNum;
    }

    public void setRfidNum(String rfidNum) {
        this.rfidNum = rfidNum;
    }
}

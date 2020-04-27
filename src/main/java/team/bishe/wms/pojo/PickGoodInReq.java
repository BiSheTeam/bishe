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
    /*
     *当前页
     **/
    private Integer  pageIndex;
    /*
     *每页显示条数
     **/
    private Integer  pageSize;
    /*
     *总记录数
     **/
    private Integer  records;

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getRecords() {
        return records;
    }
    private Integer  startRow;
    private Integer  endRow;

    public Integer getStartRow() {
        return startRow;
    }

    public void setStartRow(Integer startRow) {
        this.startRow = startRow;
    }

    public Integer getEndRow() {
        return endRow;
    }

    public void setEndRow(Integer endRow) {
        this.endRow = endRow;
    }

    public void setRecords(Integer records) {
        this.records = records;
    }

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

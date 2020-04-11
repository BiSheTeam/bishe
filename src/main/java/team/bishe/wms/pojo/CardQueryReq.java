package team.bishe.wms.pojo;

/**
 * @ClassName CardQueryReq
 * @Description 信息查询请求参数
 * @Author RJ
 * @Date 2020/4/10 22:55
 * @Version 1.0
 **/
public class CardQueryReq {
    /*
     *卡号
     **/
    private String  cardId;
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
    private String  records;
    /*
     *发卡机构号
     **/
    private String  brhId;
    /*
     *卡品牌
     **/
    private String  brandId;
    /*
     *开始日期
     **/
    private String  startDt;
    /*
     *结束日期
     **/
    private String  endDt;
    private String  startRow;
    private String  endRow;

    public String getStartRow() {
        return startRow;
    }

    public void setStartRow(String startRow) {
        this.startRow = startRow;
    }

    public String getEndRow() {
        return endRow;
    }

    public void setEndRow(String endRow) {
        this.endRow = endRow;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

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

    public String getRecords() {
        return records;
    }

    public void setRecords(String records) {
        this.records = records;
    }

    public String getBrhId() {
        return brhId;
    }

    public void setBrhId(String brhId) {
        this.brhId = brhId;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getStartDt() {
        return startDt;
    }

    public void setStartDt(String startDt) {
        this.startDt = startDt;
    }

    public String getEndDt() {
        return endDt;
    }

    public void setEndDt(String endDt) {
        this.endDt = endDt;
    }
}

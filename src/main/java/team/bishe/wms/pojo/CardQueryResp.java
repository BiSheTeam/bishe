package team.bishe.wms.pojo;

import java.util.List;

/**
 * @ClassName CardQueryResp
 * @Description
 * @Author RJ
 * @Date 2020/4/11 12:17
 * @Version 1.0
 **/
public class CardQueryResp<T> {
    private List<T> lists;
    private Integer pageNumber;
    private Integer pageSize;
    private Integer records;

    public List<T> getLists() {
        return lists;
    }

    public void setLists(List<T> lists) {
        this.lists = lists;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
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

    public void setRecords(Integer records) {
        this.records = records;
    }
}

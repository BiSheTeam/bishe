package team.bishe.wms.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import team.bishe.wms.bean.DetailedEntry;
import team.bishe.wms.bean.WarehousingEntry;
import team.bishe.wms.common.ApiResponse;
import team.bishe.wms.service.ReceiptDocQueryService;

import java.util.List;


/**
 *入库单信息查询
 */
@Slf4j
@ResponseBody
@RestController
@RequestMapping(value = "/warehouseEntryQuery")
public class RepositoryManageController{


    @Autowired
    private ReceiptDocQueryService receiptDocQueryService;

    @RequestMapping(value = "/simple",method = RequestMethod.POST)
    public ApiResponse<List<WarehousingEntry>> selectWarehouseEntry(Integer warehousingEntryID, String endDateStr, String startDateStr, Integer cusId){
        ApiResponse<List<WarehousingEntry>> apiResponse = new ApiResponse<>();
        try {
            log.info("开始查询");
            List<WarehousingEntry> list = receiptDocQueryService.selectwarehousingEntry(warehousingEntryID,endDateStr,startDateStr,cusId) ;
            apiResponse.setCode(100);
            apiResponse.setMsg("查询成功");
            apiResponse.setData(list);
        }catch (Exception e){
            log.error("失败",e.getMessage());
            e.printStackTrace();
        }
        return apiResponse;
    }

    @RequestMapping(value = "detail",method = RequestMethod.POST)
    public ApiResponse<List<DetailedEntry>> selectWarehouseDetail(Integer DetailedEntryID, String endDateStr, String startDateStr, Integer cusId){
        ApiResponse<List<DetailedEntry>> apiResponse = new ApiResponse<>();
        try {
            log.info("开始明细查询");
            List<DetailedEntry> list = receiptDocQueryService.selectWarehouseDetail(DetailedEntryID,endDateStr,startDateStr,cusId) ;
            apiResponse.setCode(100);
            apiResponse.setMsg("查询成功");
            apiResponse.setData(list);
        }catch (Exception e){
            log.error("失败",e.getMessage());
            e.printStackTrace();
        }
        return apiResponse;
    }

}

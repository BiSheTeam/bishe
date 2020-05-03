package team.bishe.wms.controller;

import io.swagger.annotations.Api;
import io.swagger.models.auth.In;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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
@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping(value = "/warehouseEntryQuery")
public class RepositoryManageController{


    @Autowired
    private ReceiptDocQueryService receiptDocQueryService;

    @RequestMapping(value = "/simple",method = RequestMethod.GET)
    public ApiResponse<List<WarehousingEntry>> selectWarehouseEntry(String warehousingEntryId, String endDateStr, String startDateStr, Integer cusId){
        ApiResponse<List<WarehousingEntry>> apiResponse = new ApiResponse<>();
        try {
            log.info("开始查询");
            List<WarehousingEntry> list = receiptDocQueryService.selectwarehousingEntry(warehousingEntryId,cusId,startDateStr,endDateStr) ;
            apiResponse.setCode(20000);
            apiResponse.setMsg("查询成功");
            apiResponse.setData(list);
        }catch (Exception e){
            log.error("失败",e.getMessage());
            e.printStackTrace();
        }
        return apiResponse;
    }

    @RequestMapping(value = "/detail",method = RequestMethod.GET)
    public ApiResponse<List<DetailedEntry>> selectWarehouseDetail(String detailedEntryId, String endDateStr, String startDateStr, Integer cusId){
        ApiResponse<List<DetailedEntry>> apiResponse = new ApiResponse<>();
        try {
            log.info("开始明细查询");
            List<DetailedEntry> list = receiptDocQueryService.selectWarehouseDetail(detailedEntryId,endDateStr,startDateStr,cusId) ;
            apiResponse.setCode(20000);
            apiResponse.setMsg("查询成功");
            apiResponse.setData(list);
        }catch (Exception e){
            log.error("失败",e.getMessage());
            e.printStackTrace();
        }
        return apiResponse;
    }

    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public ApiResponse<Boolean>  delete(String warehousingEntryId){
        ApiResponse<Boolean> apiResponse = new ApiResponse<>();
        try {
            log.info("入库表删除");
            Boolean sta = receiptDocQueryService.deleteEntry(warehousingEntryId);
            apiResponse.setCode(20000);
            apiResponse.setMsg("删除成功");
            apiResponse.setData(sta);
        }catch (Exception e){
            log.error("失败",e.getMessage());
            e.printStackTrace();
        }


        return apiResponse;
    }

    @RequestMapping(value = "/deleteDetail",method = RequestMethod.GET)
    public ApiResponse<Boolean>  deleteDetail(String detailedEntryId){
        ApiResponse<Boolean> apiResponse = new ApiResponse<>();

        try {
            log.info("明细表删除");
            Boolean sta = receiptDocQueryService.deleteDetail(detailedEntryId);
            apiResponse.setCode(20000);
            apiResponse.setMsg("删除成功");
            apiResponse.setData(sta);
        }catch (Exception e){
            log.error("失败",e.getMessage());
            e.printStackTrace();
        }
        return apiResponse;
    }

}

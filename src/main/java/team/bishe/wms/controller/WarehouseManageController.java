package team.bishe.wms.controller;

import io.swagger.models.auth.In;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import team.bishe.wms.common.ApiResponse;
import team.bishe.wms.service.WarehouseManageService;

import javax.servlet.http.HttpServletRequest;

/**
 * 入库管理信息
 */
@Slf4j
@ResponseBody
@RestController
@RequestMapping(value = "/warehouseManage")
public class WarehouseManageController {

    @Autowired
    private WarehouseManageService warehouseManageService;



    @RequestMapping(value = "/application",method = RequestMethod.POST)
    public ApiResponse warehouseapplication(@RequestParam("cusId")Integer cusId, @RequestParam("goodsName")String goodsName,
                                            @RequestParam("goodsType")String goodsType, @RequestParam("applicationDate")String applicationDate,
                                            @RequestParam("number")long number, @RequestParam("repositoryId")Integer repositoryId, HttpServletRequest request) {
        ApiResponse<Boolean> apiResponse = new ApiResponse<>();

        try {
            log.info("进行入库申请");
            Boolean state = warehouseManageService.WarehouseInApplication(cusId,goodsName,goodsType,number,applicationDate,repositoryId);
            apiResponse.setCode(100);
            apiResponse.setMsg("申请成功，准备验货");
            apiResponse.setData(state);
        } catch (Exception e) {
            log.error("入库申请失败",e.getMessage());
            e.printStackTrace();
        }

        return apiResponse;
    }

    @RequestMapping(value = "/inspection",method = RequestMethod.POST)
    public ApiResponse InspectionLoading(Integer ApplicationID, String goodsName, String goodsType,
                                         Long goodsNum){
        ApiResponse<Boolean> apiResponse = new ApiResponse<>();
        try {
            log.info("验货装盘开始");
            Boolean state = warehouseManageService.InspectionLoading(ApplicationID,goodsName,goodsType,goodsNum);
            apiResponse.setCode(100);
            apiResponse.setMsg("验货完成");
            apiResponse.setData(state);
        }catch (Exception e){
            log.error("失败",e.getMessage());
            e.printStackTrace();
        }
        return apiResponse;
    }

    @RequestMapping(value = "settlement",method = RequestMethod.POST)
    public ApiResponse warehouseSettlement(Integer applicationId, Integer warehousingEntryId){
        ApiResponse<Boolean> apiResponse = new ApiResponse<>();
        try {
            log.info("计算费用");
            Boolean state = warehouseManageService.warehouseSettlement(applicationId,warehousingEntryId);

            apiResponse.setCode(100);
            apiResponse.setMsg("支付成功");
            apiResponse.setData(state);
        }catch (Exception e){
            log.error("失败",e.getMessage());
            e.printStackTrace();
        }
        return apiResponse;
    }

    @RequestMapping(value = "storage",method = RequestMethod.POST)
    public ApiResponse inWarehouse(Integer applicationId){
        ApiResponse<Boolean> apiResponse = new ApiResponse<>();
        try {
            log.info("开始入库");
            Boolean state =warehouseManageService.inWarehouse(applicationId) ;
            apiResponse.setCode(100);
            apiResponse.setMsg("入库成功");
            apiResponse.setData(state);
        }catch (Exception e){
            log.error("失败",e.getMessage());
            e.printStackTrace();
        }
        return apiResponse;
    }
}

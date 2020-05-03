package team.bishe.wms.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import team.bishe.wms.bean.Repository;
import team.bishe.wms.common.ApiResponse;
import team.bishe.wms.service.StockInquiryService;
import team.bishe.wms.service.WarehouseManageService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 入库管理信息
 */
@Slf4j
@ResponseBody
@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping(value = "/warehouseManage")
public class WarehouseManageController {

    @Autowired
    private WarehouseManageService warehouseManageService;

    @Autowired
    private StockInquiryService stockInquiryService;



    @RequestMapping(value = "/application",method = RequestMethod.GET)
    public ApiResponse warehouseapplication(@RequestParam("cusId")Integer cusId, @RequestParam("goodsName")String goodsName,
                                            @RequestParam("goodsType")String goodsType, @RequestParam("applicationDate")String applicationDate,
                                            @RequestParam("number")String number, @RequestParam("repositoryId")String repositoryId) {
        ApiResponse<Boolean> apiResponse = new ApiResponse<>();

        try {
            log.info("进行入库申请");
            Boolean state = warehouseManageService.WarehouseInApplication(cusId,goodsName,goodsType,number,applicationDate,repositoryId);
            apiResponse.setCode(20000);
            apiResponse.setMsg("申请成功，准备验货");
            apiResponse.setData(state);
        } catch (Exception e) {
            log.error("入库申请失败",e.getMessage());
            e.printStackTrace();
        }

        return apiResponse;
    }

    @RequestMapping(value = "/inspection",method = RequestMethod.GET)
    public ApiResponse InspectionLoading(Integer applicationId, String goodsName, String goodsType,
                                         Integer goodsNum){
        ApiResponse<Boolean> apiResponse = new ApiResponse<>();

        try {
            log.info("验货装盘开始");
            Boolean state = warehouseManageService.InspectionLoading(applicationId,goodsName,goodsType,goodsNum);
            apiResponse.setCode(20000);
            apiResponse.setMsg("验货完成");
            apiResponse.setData(state);
        }catch (Exception e){
            log.error("失败",e.getMessage());
            e.printStackTrace();
        }
        return apiResponse;
    }

    @RequestMapping(value = "/settlement",method = RequestMethod.GET)
    public ApiResponse warehouseSettlement(Integer applicationId){
        ApiResponse<String> apiResponse = new ApiResponse<>();
        try {
            log.info("计算费用");
            Double value = warehouseManageService.warehouseSettlement(applicationId);

            apiResponse.setCode(20000);
            apiResponse.setMsg("成功");
            apiResponse.setData("需支付￥"+value);
        }catch (Exception e){
            log.error("失败",e.getMessage());
            e.printStackTrace();
        }
        return apiResponse;
    }

    @RequestMapping(value = "/storage",method = RequestMethod.GET)
    public ApiResponse inWarehouse(Integer applicationId){
        ApiResponse<Boolean> apiResponse = new ApiResponse<>();
        try {
            log.info("开始入库");
            Boolean state =warehouseManageService.inWarehouse(applicationId) ;
            apiResponse.setCode(20000);
            apiResponse.setMsg("入库成功");
            apiResponse.setData(state);
        }catch (Exception e){
            log.error("失败",e.getMessage());
            e.printStackTrace();
        }
        return apiResponse;
    }

    @RequestMapping(value = "/repositoryQuery",method = RequestMethod.GET)
    public ApiResponse  repositoryQuery(){
        ApiResponse<List<Repository>> apiResponse = new ApiResponse<>();
        try {
            log.info("选择仓库");
            List<Repository> select = stockInquiryService.select();
            apiResponse.setCode(20000);
            apiResponse.setMsg("成功");
            apiResponse.setData(select);
        }catch (Exception e){
            log.error("失败",e.getMessage());
            e.printStackTrace();
        }
        return apiResponse;
    }
}

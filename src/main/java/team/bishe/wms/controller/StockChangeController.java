package team.bishe.wms.controller;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import team.bishe.wms.bean.StockChange;
import team.bishe.wms.common.ApiResponse;
import team.bishe.wms.service.StockChangeService;

import java.util.Date;


@Slf4j
@ResponseBody
@RestController
@RequestMapping("/stockchange")
public class StockChangeController {
    @Autowired
    private StockChangeService stockChangeService;
    @ApiOperation(value = "查询过户信息")
    @GetMapping("stockchangeFindAllById")
    public ApiResponse SelectStockchange(Integer rowid){
        ApiResponse<StockChange> apiResponse =new ApiResponse<>();
        try {
            log.info("调用查询过户信息列表详情接口");
            StockChange stockChange = stockChangeService.SelectStockchange(rowid);
            apiResponse.setCode(200);
            apiResponse.setMsg("查询成功");
            apiResponse.setData(stockChange);
        } catch (Exception e) {
            log.error("调用查询过户信息详情接口失败",e.getMessage());
            e.printStackTrace();
        }
        return apiResponse;
    }
    @PostMapping("SaveStockchangeAndUpdateGoods")
    public ApiResponse SaveStockoutAndUpdateGoods(
            Integer rowid, String companyId, String changeWsNo, String oldCustomerId, String oldCustomerName,String newCustomerId,String newCustomerName, String tallyman, Integer totalWeight, Integer totalPackageNum,
            String remark, String status, String createCode, String updateCode, String goodId){
        ApiResponse<Object> apiResponse = new ApiResponse<>();
        try {
            log.info("调用过户操作接口");
            StockChange stockChange = new StockChange();
            stockChange.setRowid(rowid);
            stockChange.setCompanyId(companyId);
            stockChange.setChangeWsNo(changeWsNo);
            stockChange.setOldCustomerId(oldCustomerId);
            stockChange.setOldCustomerName(oldCustomerName);
            stockChange.setNewCustomerId(newCustomerId);
            stockChange.setNewCustomerName(newCustomerName);
            stockChange.setTallyman(tallyman);
            stockChange.setTotalWeight(totalWeight);
            stockChange.setTotalPackageNum(totalPackageNum);
            stockChange.setRemark(remark);
            stockChange.setStatus(status);
            stockChange.setCreateCode(createCode);
            stockChange.setCreateDate(new Date());
            stockChange.setUpdateCode(updateCode);
            stockChange.setUpdateDate(new Date().toString());
            stockChange.setGoodId(goodId);
            stockChangeService.SaveStockchangeAndUpdateGoods(stockChange);
            apiResponse.setCode(200);
            apiResponse.setMsg("过户成功");
            apiResponse.setData(stockChange);
        } catch (Exception e) {
            log.error("调用过户操作接口失败",e.getMessage());
            e.printStackTrace();
        }



        return apiResponse;
    }
}

package team.bishe.wms.controller;

import org.aspectj.bridge.MessageUtil;
import team.bishe.wms.common.ApiResponse;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import team.bishe.wms.bean.StockOut;

import team.bishe.wms.service.StockOutService;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.Date;


@Slf4j
@ResponseBody
@RestController
@RequestMapping("/stockout")
public class StockOutController {
    @Autowired
    private StockOutService stockOutService;
    @ApiOperation(value = "查询出库信息")
    @GetMapping("stockoutFindAllById")
    public ApiResponse SelectStockout(Integer rowid){
        ApiResponse<StockOut> apiResponse =new ApiResponse<>();
        try {
            log.info("调用查询出库信息列表详情接口");
            StockOut stockOut = stockOutService.SelectStockout(rowid);
            apiResponse.setCode(200);
            apiResponse.setMsg("查询成功");
            apiResponse.setData(stockOut);
        } catch (Exception e) {
            log.error("调用查询出库信息详情接口失败",e.getMessage());
            e.printStackTrace();
        }
        return apiResponse;
    }
    @PostMapping("SaveStockoutAndUpdateGoods")
    public ApiResponse SaveStockoutAndUpdateGoods(
            Integer rowid, String companyId, String outWsNo, Integer customerId, String customerName, String tallyman, Integer totalWeight, Integer totalPackageNum,
            String remark, String status, String createCode, String updateCode, String goodId, String whouseId){
        ApiResponse<Object> apiResponse = new ApiResponse<>();
        try {
            log.info("调用出库操作接口");
            StockOut stockOut = new StockOut();
            stockOut.setRowid(rowid);
            stockOut.setCompanyId(companyId);
            stockOut.setOutWsNo(outWsNo);
            stockOut.setOutWsTime(new Date());
            stockOut.setCustomerId(customerId);
            stockOut.setCustomerName(customerName);
            stockOut.setTallyman(tallyman);
            stockOut.setTotalWeight(totalWeight);
            stockOut.setTotalPackageNum(totalPackageNum);
            stockOut.setRemark(remark);
            stockOut.setStatus(status);
            stockOut.setCreateCode(createCode);
            stockOut.setCreateDate(new Date());
            stockOut.setUpdateCode(updateCode);
            stockOut.setUpdateDate(new Date().toString());
            stockOut.setGoodId(goodId);
            stockOut.setWhouseId(whouseId);
            stockOutService.SaveStockoutAndUpdateGoods(stockOut);
            apiResponse.setCode(200);
            apiResponse.setMsg("出库成功");
            apiResponse.setData(stockOut);
        } catch (Exception e) {
            log.error("调用出库操作接口失败",e.getMessage());
            e.printStackTrace();
        }



        return apiResponse;
    }
}

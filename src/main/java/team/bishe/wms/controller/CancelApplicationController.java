package team.bishe.wms.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import team.bishe.wms.common.ApiResponse;
import team.bishe.wms.service.CancelApplicationService;

/**
 * 取消订单
 */
@Slf4j
@ResponseBody
@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping(value = "/cancelApplication")
public class CancelApplicationController {

    @Autowired
    private CancelApplicationService cancelApplicationService;

    @RequestMapping(value = "/cancelOrder",method = RequestMethod.GET)
    public ApiResponse cancelApplication(String applicationId){
        ApiResponse apiResponse = new ApiResponse<>();
        try {
            log.info("申请退货");
            cancelApplicationService.cancelOrder(applicationId);
            apiResponse.setCode(20000);
            apiResponse.setMsg("退货成功");
        }catch (Exception e){
            log.error("失败",e.getMessage());
            e.printStackTrace();
        }
        return apiResponse;
    }
}

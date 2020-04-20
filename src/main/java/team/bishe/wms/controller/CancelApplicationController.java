package team.bishe.wms.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import team.bishe.wms.common.ApiResponse;
import team.bishe.wms.service.CancelApplicationService;

/**
 * 取消订单
 */
@Slf4j
@ResponseBody
@RestController
@RequestMapping(value = "/CancelApplication")
public class CancelApplicationController {

    @Autowired
    private CancelApplicationService cancelApplicationService;

    public ApiResponse cancelApplication(Integer applicationId){
        ApiResponse apiResponse = new ApiResponse<>();
        try {
            log.info("申请退货");
            cancelApplicationService.cancelOrder(applicationId);
            apiResponse.setCode(100);
            apiResponse.setMsg("成功");
        }catch (Exception e){
            log.error("失败",e.getMessage());
            e.printStackTrace();
        }
        return apiResponse;
    }
}

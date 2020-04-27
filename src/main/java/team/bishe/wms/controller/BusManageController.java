package team.bishe.wms.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import team.bishe.wms.common.ApiResponse;
import team.bishe.wms.pojo.BusManagementReq;
import team.bishe.wms.service.BusManageService;

import java.util.List;

/**
 * @ClassName BusManageController
 * @Description
 * @Author RJ
 * @Date 2020/4/10 18:25
 * @Version 1.0
 **/

@Slf4j
@ResponseBody
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/busManage")
public class BusManageController {
    @Autowired
    private BusManageService busManageService;
    /*
     * @Author RenJian
     * @Description 业务管理>卡账户冻结
     **/
    @RequestMapping("/cardFrozen")
    public ApiResponse cardFrozen(BusManagementReq busManagementReq){
        ApiResponse<Object> apiResponse = new ApiResponse<>();
        try {
            log.info("调用卡账户冻结接口");
            if (busManagementReq.getCardId() == null | busManagementReq.getCustId() == null){
                apiResponse.setCode(401);
                apiResponse.setMsg("账户冻结失败");
            }else {
                busManageService.cardFrozen(busManagementReq);
                apiResponse.setCode(20000);
                apiResponse.setMsg("账户冻结成功");
            }

        } catch (Exception e) {
            log.error("调用卡账户冻结接口失败",e.getMessage());
            e.printStackTrace();
        }
        return apiResponse;
    }

    /*
     * @Author RenJian
     * @Description 业务管理>卡账户解冻
     **/
    @RequestMapping("/cardThaw")
    public ApiResponse cardThaw(BusManagementReq busManagementReq){
        ApiResponse<Object> apiResponse = new ApiResponse<>();
        log.info("调用卡账户解冻接口");
        try {
            if (busManagementReq.getCardId() == null | busManagementReq.getCustId() == null){
                apiResponse.setCode(401);
                apiResponse.setMsg("账户解冻失败");
            }else {
                busManageService.cardThaw(busManagementReq);
                apiResponse.setCode(20000);
                apiResponse.setMsg("账户解冻成功");
            }
        } catch (Exception e) {
            log.error("调用卡账户解冻接口失败",e.getMessage());
            e.printStackTrace();
        }
        return apiResponse;
    }
}

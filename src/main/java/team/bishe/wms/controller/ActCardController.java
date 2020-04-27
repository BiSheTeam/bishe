package team.bishe.wms.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import team.bishe.wms.bean.TcardDoc;
import team.bishe.wms.common.ApiResponse;
import team.bishe.wms.pojo.OpencardReq;
import team.bishe.wms.service.OpenCardService;

import java.util.List;

/**
 * @ClassName ActCardController
 * @Description
 * @Author RJ
 * @Date 2020/4/10 16:53
 * @Version 1.0
 **/
@Slf4j
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@ResponseBody
@RequestMapping("/actCard")
public class ActCardController {

    @Autowired
    private OpenCardService openCardService;
    /*
     * @Author RenJian
     * @Description 开卡申请>单卡开卡
     **/
    @RequestMapping("/signOpenCard")
    public ApiResponse signOpenCard(OpencardReq opencardReq){
        ApiResponse<Object> apiResponse = new ApiResponse<>();
        try {
            log.info("调用单卡开卡接口");
            openCardService.openCard(opencardReq);
            apiResponse.setCode(20000);
            apiResponse.setMsg("开卡成功！");
        } catch (Exception e) {
            log.error("调用单卡开卡接口失败",e.getMessage());
            e.printStackTrace();
        }
        return apiResponse;
    }

    /*
     * @Author RenJian
     * @Description 开卡申请>批量开卡
     **/
    @RequestMapping("/batchOpenCard")
    public ApiResponse batchOpenCard(OpencardReq opencardReq){
        ApiResponse<Object> apiResponse = new ApiResponse<>();
        try {
            log.info("调用批量开卡接口");
            openCardService.batchOpenCard(opencardReq);
            apiResponse.setCode(20000);
            apiResponse.setMsg("开卡成功！");
        } catch (Exception e) {
            log.error("调用批量开卡接口失败",e.getMessage());
            e.printStackTrace();
        }
        return apiResponse;
    }
}

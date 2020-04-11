package team.bishe.wms.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import team.bishe.wms.bean.PickForm;
import team.bishe.wms.common.ApiResponse;
import team.bishe.wms.pojo.PickGoodInReq;
import team.bishe.wms.pojo.PickGoodOutResp;
import team.bishe.wms.service.PickGoodInService;

import java.util.List;

/**
 * @ClassName PickGoodIn
 * @Description 拣选物品对内接口
 * @Author RJ
 * @Date 2020/4/11 14:58
 * @Version 1.0
 **/
@Slf4j
@ResponseBody
@RestController
@RequestMapping("pickGoodIn")
public class PickGoodInController {

    @Autowired
    private PickGoodInService pickGoodInService;
    /*
     * @Author RenJian
     * @Description 新增拣选货物单接口
     **/
    @RequestMapping("/makePickForm")
    public ApiResponse makePickForm(PickGoodInReq pickGoodInReq){
        ApiResponse apiResponse = new ApiResponse<>();
        try {
            log.info("调用新增拣选货物单接口");
            pickGoodInService.makePickForm(pickGoodInReq);
            apiResponse.setCode(200);
            apiResponse.setMsg("新增成功");
        } catch (Exception e) {
            log.error("调用新增拣选货物单接口失败",e.getMessage());
        }
        return apiResponse;
    }
    /*
     * @Author RenJian
     * @Description 拣选货物单查询接口
     **/
    @RequestMapping("/queryPickForm")
    public ApiResponse queryPickForm(String custId){
        ApiResponse<List<PickForm>> apiResponse = new ApiResponse<>();
        try {
            log.info("调用拣选货物单查询接口");
            List<PickForm> pickForms = pickGoodInService.queryPickForm(custId);
            apiResponse.setCode(200);
            apiResponse.setMsg("查询成功");
            apiResponse.setData(pickForms);

        } catch (Exception e) {
            log.error("调用拣选货物单查询接口失败",e.getMessage());
        }
        return apiResponse;
    }
    /*
     * @Author RenJian
     * @Description 删除拣选货物单接口
     **/
    @RequestMapping("/delPickForm")
    public ApiResponse delPickForm(String gFormId){
        ApiResponse apiResponse = new ApiResponse<>();
        try {
            log.info("调用删除拣选货物单接口");
            apiResponse.setCode(200);
            apiResponse.setMsg("删除拣货单成功");
        } catch (Exception e) {
            log.error("调用删除拣选货物单接口失败",e.getMessage());
        }
        return apiResponse;
    }
}

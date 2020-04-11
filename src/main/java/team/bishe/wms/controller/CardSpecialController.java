package team.bishe.wms.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import team.bishe.wms.common.ApiResponse;
import team.bishe.wms.pojo.CardSpecialReq;
import team.bishe.wms.service.CardSpecialService;

/**
 * @ClassName CardSpecialController
 * @Description 卡特殊处理
 * @Author RJ
 * @Date 2020/4/10 19:11
 * @Version 1.0
 **/
@Slf4j
@RestController
@ResponseBody
@RequestMapping("/cardSpecial")
public class CardSpecialController {
    @Autowired
    private CardSpecialService cardSpecialService;
    /*
     * @Author RenJian
     * @Description 特殊处理>卡挂失
     **/
    @RequestMapping("/cardLoss")
    public ApiResponse cardLoss(CardSpecialReq cardSpecialReq){
        ApiResponse<Object> apiResponse = new ApiResponse<>();
        try {
            log.info("调用卡挂失接口");
            cardSpecialService.cardLoss(cardSpecialReq);
            apiResponse.setCode(200);
            apiResponse.setMsg("卡挂失成功");
        } catch (Exception e) {
            log.error("调用卡挂失接口失败",e.getMessage());
            e.printStackTrace();
        }
        return apiResponse;
    }
    /*
     * @Author RenJian
     * @Description 特殊处理>卡解挂
     **/
    @RequestMapping("/cancelLoss")
    public ApiResponse cancelLoss(CardSpecialReq cardSpecialReq){
        ApiResponse<Object> apiResponse = new ApiResponse<>();
        try {
            log.info("调用卡解挂接口");
            cardSpecialService.cancelLoss(cardSpecialReq);
            apiResponse.setCode(200);
            apiResponse.setMsg("卡解挂成功");
        } catch (Exception e) {
            log.error("调用卡解挂接口失败",e.getMessage());
            e.printStackTrace();
        }
        return apiResponse;
    }
    /*
     * @Author RenJian
     * @Description 特殊处理>卡延期
     **/
    @RequestMapping("/cardDelay")
    public ApiResponse cardDelay(CardSpecialReq cardSpecialReq){
        ApiResponse<Object> apiResponse = new ApiResponse<>();
        try {
            log.info("调用卡延期接口");
            cardSpecialService.cardDelay(cardSpecialReq);
            apiResponse.setCode(200);
            apiResponse.setMsg("卡延期成功");
        } catch (Exception e) {
            log.error("调用卡延期接口失败",e.getMessage());
            e.printStackTrace();
        }
        return apiResponse;
    }
    /*
     * @Author RenJian
     * @Description 特殊处理>退卡
     **/
    @RequestMapping("/cardRefund")
    public ApiResponse cardRefund(CardSpecialReq cardSpecialReq){
        ApiResponse<Object> apiResponse = new ApiResponse<>();
        try {
            log.info("调用退卡接口");
            cardSpecialService.cardRefund(cardSpecialReq);
            apiResponse.setCode(200);
            apiResponse.setMsg("退卡成功");
        } catch (Exception e) {
            log.error("调用退卡接口",e.getMessage());
            e.printStackTrace();
        }
        return apiResponse;
    }
}

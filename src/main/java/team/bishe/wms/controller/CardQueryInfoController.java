package team.bishe.wms.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import team.bishe.wms.bean.TcardInfo;
import team.bishe.wms.common.ApiResponse;
import team.bishe.wms.pojo.CardQueryReq;
import team.bishe.wms.pojo.QueryResp;
import team.bishe.wms.service.CardInfoQueryService;

/**
 * @ClassName CardQueryInfo
 * @Description 卡信息查询
 * @Author RJ
 * @Date 2020/4/10 22:21
 * @Version 1.0
 **/

@Slf4j
@CrossOrigin(origins = "*", maxAge = 3600)
@ResponseBody
@RestController
@RequestMapping("/cardQuery")
public class CardQueryInfoController {
    @Autowired
    private CardInfoQueryService cardInfoQueryService;
    /*
     * @Author RenJian
     * @Description 查询卡信息列表
     **/
    @RequestMapping("/cardInfoList")
    public ApiResponse cardInfoList(CardQueryReq cardQueryReq){
       /* response.setHeader("Access-Control-Allow-Origin", "*");*/

        ApiResponse<QueryResp<TcardInfo>> apiResponse = new ApiResponse<>();
        try {
            log.info("调用查询卡信息列表接口");
            QueryResp<TcardInfo> lists = cardInfoQueryService.cardInfoList(cardQueryReq);
            apiResponse.setCode(20000);
            apiResponse.setMsg("查询成功");
            apiResponse.setData(lists);
        } catch (Exception e) {
            log.error("调用查询卡信息列表接口失败",e.getMessage());
            e.printStackTrace();
        }
        return apiResponse;
    }
    /*
     * @Author RenJian
     * @Description 查询卡信息列表详情
     **/
    @RequestMapping("/cardInfoDetail")
    public ApiResponse cardLossDetail(CardQueryReq cardQueryReq){
        ApiResponse<TcardInfo> apiResponse = new ApiResponse<>();
        try {
            log.info("调用查询卡信息列表详情接口");
            TcardInfo tcardInfo = cardInfoQueryService.cardInfoDetail(cardQueryReq);
            apiResponse.setCode(20000);
            apiResponse.setMsg("查询成功");
            apiResponse.setData(tcardInfo);
        } catch (Exception e) {
            log.error("调用查询卡信息详情接口失败",e.getMessage());
            e.printStackTrace();
        }
        return apiResponse;
    }
    /*
     * @Author RenJian
     * @Description 查询开卡记录列表
     **/
    @RequestMapping("/openCardList")
    public ApiResponse openCardList(CardQueryReq cardQueryReq){
        ApiResponse<QueryResp<TcardInfo>> apiResponse = new ApiResponse<>();
        try {
            log.info("调用查询开卡记录列表接口");
            QueryResp<TcardInfo> lists = cardInfoQueryService.openCardList(cardQueryReq);
            apiResponse.setCode(20000);
            apiResponse.setMsg("查询成功");
            apiResponse.setData(lists);
        } catch (Exception e) {
            log.error("调用查询开卡记录列表接口失败",e.getMessage());
            e.printStackTrace();
        }
        return apiResponse;
    }
    /*
     * @Author RenJian
     * @Description 查询开卡记录详情
     **/
    @RequestMapping("/openCardDetail")
    public ApiResponse openCardDetail(CardQueryReq cardQueryReq){
        ApiResponse<TcardInfo> apiResponse = new ApiResponse<>();
        try {
            log.info("调用查询开卡记录列表详情接口");
            TcardInfo tcardInfo = cardInfoQueryService.openCardDetail(cardQueryReq);
            apiResponse.setCode(20000);
            apiResponse.setMsg("查询成功");
            apiResponse.setData(tcardInfo);
        } catch (Exception e) {
            log.error("调用查询开卡记录列表详情接口失败",e.getMessage());
            e.printStackTrace();
        }
        return apiResponse;
    }
}

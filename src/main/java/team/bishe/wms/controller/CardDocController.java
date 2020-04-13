package team.bishe.wms.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import team.bishe.wms.bean.TbrandInfo;
import team.bishe.wms.bean.TcardDoc;
import team.bishe.wms.bean.TcardInfo;
import team.bishe.wms.bean.TcardUse;
import team.bishe.wms.common.ApiResponse;
import team.bishe.wms.service.CardService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @ClassName CardController
 * @Description
 * @Author RJ
 * @Date 2020/4/9 10:58
 * @Version 1.0
 **/
@Slf4j
@RestController
@ResponseBody
@RequestMapping("/cardDoc")
public class CardDocController {

    @Autowired
    private CardService cardService;
    @Autowired
    private CommonController commonController;
    /*
     * @Author RenJian
     * @Description 查询可用号段
     **/
    @RequestMapping("/usabelNumList")
    public ApiResponse usabelNumList(){
        ApiResponse<List<TcardUse>> apiResponse = new ApiResponse<List<TcardUse>>();
        try {
            log.info("调用查询可用号段接口");
            List<TcardUse> tcardUses = cardService.queryUsabelNum();
            if (tcardUses != null){
                apiResponse.setCode(200);
                apiResponse.setMsg("OK");
                apiResponse.setData(tcardUses);
            }else {
                apiResponse.setCode(200);
                apiResponse.setMsg("NO");
            }
        } catch (Exception e) {
            log.error("调用查询可用号段接口失败",e.getMessage());
            e.printStackTrace();
        }
        return apiResponse;
    }

    /*
     * @Author RenJian
     * @Description 制卡申请>新增
     **/
    @RequestMapping("/cardDocAdd")
    public ApiResponse cardDocAdd(TcardDoc tcardDoc , HttpServletRequest request){
        ApiResponse<Object> apiResponse = new ApiResponse<>();
        try {
            log.info("调用新增卡档接口");
            String id = "12"/*Long.toString(commonController.getLoginAccount(request))*/;
            tcardDoc.setLastUpdOprId(id);
            tcardDoc.setAuditOprId(id);
            tcardDoc.setAppOprId(id);
            cardService.makeCardDoc(tcardDoc);
            apiResponse.setCode(200);
            apiResponse.setMsg("OK");
        } catch (Exception e) {
            apiResponse.setCode(401);
            apiResponse.setMsg("error");
            log.error("调用新增卡档接口失败",e.getMessage());
            e.printStackTrace();
        }
        return apiResponse;
    }

    /*
     * @Author RenJian
     * @Description 制卡申请>卡档申请记录查询
     **/
    @RequestMapping("/cardDocList")
    public ApiResponse cardDocList(){
        ApiResponse<List<TcardDoc>> apiResponse = new ApiResponse<List<TcardDoc>>();
        try {
            log.info("调用卡档申请记录查询接口");
            List<TcardDoc> docs = cardService.cardDocList();
            apiResponse.setCode(200);
            apiResponse.setData(docs);
            apiResponse.setMsg("OK");
        } catch (Exception e) {
            log.error("调用卡档申请记录查询接口失败",e.getMessage());
            e.printStackTrace();
        }
        return apiResponse;
    }
    /*
     * @Author RenJian
     * @Description 制卡申请>卡品牌查询(实体卡)
     **/
    @RequestMapping("/cardBrandList")
    public ApiResponse cardBrandList(){
        ApiResponse<List<TbrandInfo>> apiResponse = new ApiResponse<List<TbrandInfo>>();
        try {
            log.info("调用查询卡品牌信息接口");
            List<TbrandInfo> tbrandInfos = cardService.queryCardBrandInfo();
            apiResponse.setCode(200);
            apiResponse.setMsg("OK");
            apiResponse.setData(tbrandInfos);
        } catch (Exception e) {
            log.error("调用查询卡品牌信息接口失败",e.getMessage());
            e.printStackTrace();
        }
        return apiResponse;
    }

    /*
     * @Author RenJian
     * @Description 制卡申请>卡档撤销
     **/
    @RequestMapping("/cardDocCancel")
    public ApiResponse cardDocCancel(Integer docAppId){
        ApiResponse<Object> apiResponse = new ApiResponse<>();
        try {
            log.info("调用卡档撤销接口");
            cardService.cardDocCancel(docAppId);
            apiResponse.setCode(200);
            apiResponse.setMsg("卡档撤销成功");
        } catch (Exception e) {
            log.error("调用卡档撤销接口失败",e.getMessage());
            e.printStackTrace();
        }
        return apiResponse;
    }
    /*
     * @Author RenJian
     * @Description 制卡申请>卡档入库
     **/
    @RequestMapping("/cardDocIndepot")
    public ApiResponse cardDocIndepot(TcardDoc tcardDoc,HttpServletRequest request){
        ApiResponse<Object> apiResponse = new ApiResponse<>();
        try {
            log.info("调用卡档入库接口");
            String id = "12"/*Long.toString(commonController.getLoginAccount(request))*/;
            TcardInfo tcardInfo = new TcardInfo();
            tcardInfo.setLastUpdOprId(id);
            cardService.cardDocIndepot(tcardDoc,tcardInfo);
            apiResponse.setCode(200);
            apiResponse.setMsg("卡档入库成功");
        } catch (Exception e) {
            log.error("调用卡档入库接口失败",e.getMessage());
            e.printStackTrace();
        }
        return apiResponse;
    }
    /*
     * @Author RenJian
     * @Description 制卡申请>卡档拒绝
     **/
    @RequestMapping("/cardDocRefuse")
    public  ApiResponse cardDocRefuse(Integer docAppId){
        ApiResponse<Object> apiResponse = new ApiResponse<>();
        try {
            log.info("调用卡档拒绝接口");
            cardService.cardDocRefuse(docAppId);
            apiResponse.setCode(200);
            apiResponse.setMsg("卡档拒绝成功");
        } catch (Exception e) {
            log.error("调用卡档拒绝接口失败",e.getMessage());
            e.printStackTrace();
        }
        return apiResponse;
    }
    /*
     * @Author RenJian
     * @Description 制卡申请>卡档被拒绝记录查询
     **/
    @RequestMapping("/cardDocRefList")
    public ApiResponse cardDocRefList(){
        ApiResponse<List<TcardDoc>> apiResponse = new ApiResponse<>();
        try {
            log.info("调用档被拒绝记录查询");
            List<TcardDoc> tcardDocs = cardService.cardDocRefList();
            apiResponse.setCode(200);
            apiResponse.setMsg("OK");
            apiResponse.setData(tcardDocs);
        } catch (Exception e) {
            log.error("调用档被拒绝记录查询",e.getMessage());
            e.printStackTrace();
        }
        return apiResponse;
    }
}

package team.bishe.wms.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import team.bishe.wms.common.ApiResponse;
import team.bishe.wms.pojo.PickGoodOutResp;
import team.bishe.wms.service.PickGoodOutService;

import java.util.List;

/**
 * @ClassName PickGoodOut
 * @Description 拣选物品对外接口
 * @Author RJ
 * @Date 2020/4/11 14:59
 * @Version 1.0
 **/
@Slf4j
@RestController
@ResponseBody
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/pickGoodOut")
public class PickGoodOutController {
    @Autowired
    private PickGoodOutService pickGoodOutService;
    /*
     * @Author RenJian
     * @Description 输送系统整箱拣选对外保留接口
     **/
    @RequestMapping("/conveSystem")
    public ApiResponse conveSystem(String pickMode){
        ApiResponse<List<PickGoodOutResp>> apiResponse = new ApiResponse<List<PickGoodOutResp>>();
        try {
            System.out.println(pickMode);
            log.info("调取输送系统整箱拣选对外保留接口");
            List<PickGoodOutResp> resp = pickGoodOutService.pickGood(pickMode);
            apiResponse.setCode(20000);
            apiResponse.setMsg("成功获取参数");
            apiResponse.setData(resp);
        } catch (Exception e) {
            log.error("输送系统整箱拣选对外保留接口失败",e.getMessage());
            e.printStackTrace();
        }
        return apiResponse;
    }
    /*
     * @Author RenJian
     * @Description 托盘整箱拣选对外保留接口
     **/
    @RequestMapping("/pallPack")
    public ApiResponse pallPack(String pickMode){
        ApiResponse<List<PickGoodOutResp>> apiResponse = new ApiResponse<List<PickGoodOutResp>>();
        try {
            log.info("调取托盘整箱拣选对外保留接口");
            List<PickGoodOutResp> resp = pickGoodOutService.pickGood(pickMode);
            apiResponse.setCode(20000);
            apiResponse.setMsg("成功获取参数");
            apiResponse.setData(resp);
        } catch (Exception e) {
            log.error("调取托盘整箱拣选对外保留接口失败",e.getMessage());
        }
        return apiResponse;
    }
    /*
     * @Author RenJian
     * @Description 自动混箱拣选对外保留接口
     **/
    @RequestMapping("/autoMixbox")
    public ApiResponse autoMixbox(String pickMode){
        ApiResponse<List<PickGoodOutResp>> apiResponse = new ApiResponse<List<PickGoodOutResp>>();
        try {
            log.info("调取自动混箱拣选对外保留接口");
            List<PickGoodOutResp> resp = pickGoodOutService.pickGood(pickMode);
            apiResponse.setCode(20000);
            apiResponse.setMsg("成功获取参数");
            apiResponse.setData(resp);
        } catch (Exception e) {
            log.error("调取自动混箱拣选对外保留接口失败",e.getMessage());
        }
        return apiResponse;
    }
    /*
     * @Author RenJian
     * @Description 集群拣选对外保留接口
     **/
    @RequestMapping("/colony")
    public ApiResponse colony(String pickMode){
        ApiResponse<List<PickGoodOutResp>> apiResponse = new ApiResponse<List<PickGoodOutResp>>();
        try {
            log.info("调取集群拣选对外保留接口");
            List<PickGoodOutResp> resp = pickGoodOutService.pickGood(pickMode);
            apiResponse.setCode(20000);
            apiResponse.setMsg("成功获取参数");
            apiResponse.setData(resp);
        } catch (Exception e) {
            log.error("调取集群拣选对外保留接口失败",e.getMessage());
        }
        return apiResponse;
    }
    /*
     * @Author RenJian
     * @Description 批量分拣对外保留接口
     **/
    @RequestMapping("/batchSort")
    public ApiResponse batchSort(String pickMode){
        ApiResponse<List<PickGoodOutResp>> apiResponse = new ApiResponse<List<PickGoodOutResp>>();
        try {
            log.info("调取批量分拣对外保留接口");
            List<PickGoodOutResp> resp = pickGoodOutService.pickGood(pickMode);
            apiResponse.setCode(20000);
            apiResponse.setMsg("成功获取参数");
            apiResponse.setData(resp);
        } catch (Exception e) {
            log.error("调取批量分拣对外保留接口失败",e.getMessage());
        }
        return apiResponse;
    }
    /*
     * @Author RenJian
     * @Description 货到机器人拣选对外保留接口
     **/
    @RequestMapping("/devRobot")
    public ApiResponse devRobot(String pickMode){
        ApiResponse<List<PickGoodOutResp>> apiResponse = new ApiResponse<>();
        try {
            log.info("调取货到机器人拣选对外保留接口");
            List<PickGoodOutResp> resp = pickGoodOutService.pickGood(pickMode);
            apiResponse.setCode(20000);
            apiResponse.setMsg("成功获取参数");
            apiResponse.setData(resp);
        } catch (Exception e) {
            log.error("调取货到机器人拣选对外保留接口失败",e.getMessage());
        }
        return apiResponse;
    }
    /*
     * @Author RenJian
     * @Description 托盘整箱拣选对外保留接口
     **/
    @RequestMapping("/regionRoute")
    public ApiResponse regionRoute(String pickMode){
        ApiResponse<List<PickGoodOutResp>> apiResponse = new ApiResponse<>();
        try {
            log.info("调取托盘整箱拣选对外保留接口");
            List<PickGoodOutResp> resp = pickGoodOutService.pickGood(pickMode);
            apiResponse.setCode(20000);
            apiResponse.setMsg("成功获取参数");
            apiResponse.setData(resp);
        } catch (Exception e) {
            log.error("调取托盘整箱拣选对外保留接口失败",e.getMessage());
        }
        return apiResponse;
    }
}

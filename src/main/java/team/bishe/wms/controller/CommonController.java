package team.bishe.wms.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @ClassName CommonController
 * @Description 公共接口
 * @Author RJ
 * @Date 2020/4/9 10:47
 * @Version 1.0
 **/
@Component
@Slf4j
public class CommonController {
    /*
     * @Author RenJian
     * @Description 获取当前登录人账号
     **/
    public Long getLoginAccount(HttpServletRequest request){
        Long id = null;
        try {
            log.info("获取当前登陆人ID:{}");
            HttpSession session = request.getSession();
            id = (Long) session.getAttribute("loginUserId");

        } catch (Exception e) {
            log.error("获取当前登陆人ID出错");
            e.printStackTrace();
        }
        return id;
    }
    /**
     * 获取当前登录人所属的机构号
     * @param request
     * @return
     */
    public String getBusinessBrhId(HttpServletRequest request){
//        String businBrhId = getHeadersMapInfo(requestDescriptor).get("X-BUSINESS-BRH-ID");
        String businBrhId = "0255103000";
        log.info("获取当前登录人所属的机构号:{}",businBrhId);
        return businBrhId;
    }
}

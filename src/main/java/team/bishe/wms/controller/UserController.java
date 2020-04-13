package team.bishe.wms.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import team.bishe.wms.bean.User;
import team.bishe.wms.common.ApiResponse;
import team.bishe.wms.service.UserService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @ClassName LoginController
 * @Description
 * @Author RJ
 * @Date 2020/4/8 17:12
 * @Version 1.0
 **/
@Slf4j
@ResponseBody
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private RedisTemplate redisTemplate;
    /*
     * @Author RenJian
     * @Description 注册接口
     * @Date 17:30 2020/4/8
     * @Param [user]
     * @return team.bishe.wms.common.ApiResponse
     **/
    @RequestMapping("/regist")
    public ApiResponse regist(User user){
        return userService.regist(user);
    }
    /*
     * @Author RenJian
     * @Description 登录接口
     * @Date 17:34 2020/4/8
     * @Param [user]
     * @return team.bishe.wms.common.ApiResponse
     **/
    @RequestMapping("/login")
    public ApiResponse login(User user, HttpServletRequest request){
        ApiResponse<Object> apiResponse = new ApiResponse<>();
        try {
            User loginUser = userService.login(user);
            HttpSession session = request.getSession();
            if (loginUser != null){
                session.setAttribute("loginUserId",loginUser.getUserId());
                redisTemplate.opsForValue().set(session.getId(), "loginUser", loginUser.getUserId());
                apiResponse.setCode(200);
                apiResponse.setMsg("登陆成功");
                apiResponse.setData(user);
                }else {
                apiResponse.setCode(401);
                apiResponse.setMsg("账号或密码错误");
            }
            } catch (Exception e) {
            e.printStackTrace();
        }
        return apiResponse;
    }
}

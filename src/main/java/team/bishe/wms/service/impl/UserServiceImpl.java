package team.bishe.wms.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.bishe.wms.bean.User;
import team.bishe.wms.common.ApiResponse;
import team.bishe.wms.mapper.UserMapper;
import team.bishe.wms.service.UserService;

/**
 * @ClassName UserServiceImpl
 * @Description
 * @Author RJ
 * @Date 2020/4/8 17:31
 * @Version 1.0
 **/
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public ApiResponse regist(User user) {
        ApiResponse<Object> apiResponse = new ApiResponse<>();
        try {
            System.out.println(user.getUserName());
            User existUser = userMapper.findUserByName(user.getUserName());

            if (existUser != null) {
                //如果用户名已存在
                apiResponse.setCode(200);
                apiResponse.setMsg("用户名已经存在");
            } else {
                System.out.println(user.getUserEmail());
                userMapper.addUser(user);
                apiResponse.setCode(200);
                apiResponse.setMsg("恭喜您，注册成功");
                apiResponse.setData(user);
            }
        } catch (Exception e) {
            apiResponse.setMsg("用户注册失败");
            log.error("注册用户失败", e.getMessage());
            e.printStackTrace();
        }
        return apiResponse;
    }

    @Override
    public User login(User user) {
        return userMapper.findUserId(user);
    }
}

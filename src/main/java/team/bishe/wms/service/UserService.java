package team.bishe.wms.service;

import org.springframework.stereotype.Service;
import team.bishe.wms.bean.User;
import team.bishe.wms.common.ApiResponse;

/**
 * @ClassName UserService
 * @Description
 * @Author RJ
 * @Date 2020/4/8 17:27
 * @Version 1.0
 **/
@Service
public interface UserService {

    public ApiResponse regist(User user);

    public User login(User user);
}

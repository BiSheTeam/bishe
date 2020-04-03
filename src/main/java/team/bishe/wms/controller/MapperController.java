package team.bishe.wms.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import team.bishe.wms.bean.User;
import team.bishe.wms.common.ApiResponse;
import team.bishe.wms.mapper.UserMapper;

import java.util.List;

@Slf4j
@RestController
@ResponseBody
@RequestMapping("/user")
public class MapperController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/query")
    public ApiResponse<List<User>> queryUser(){
        List<User> users = userMapper.queryUserList();
/*        User user = new User();
        users.forEach(e->{
            user.setId(e.getId());
            user.setName(e.getName());
            user.setPassword(e.getPassword());
            user.setUsername(e.getUsername());
        });*/
        return new ApiResponse<List<User>>(1,"OK",users);
    }
}

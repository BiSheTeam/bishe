package team.bishe.wms.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import team.bishe.wms.bean.User;

import javax.annotation.Resource;
import java.util.List;

@Component
@Mapper
public interface UserMapper {
    /**
     * @Author RenJian
     * @Description 查询用户是否存在，若存在则不允许注册
     * @Date 17:36 2020/4/8
     * @Param
     * @return
     */
    public User findUserByName(String username);
    /*
     * @Author RenJian
     * @Description 增加用户
     * @Date 17:42 2020/4/8
     * @Param [user]
     * @return void
     **/
    public void addUser(User user);
    /*
     * @Author RenJian
     * @Description 查找用户ID
     * @Date 18:05 2020/4/8
     * @Param [username]
     * @return java.lang.Integer
     **/
    public User findUserId(User user);


}

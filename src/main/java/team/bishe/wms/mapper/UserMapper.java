package team.bishe.wms.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import team.bishe.wms.bean.User;

import java.util.List;

@Component
@Mapper
public interface UserMapper {
    public List<User> queryUserList();
}

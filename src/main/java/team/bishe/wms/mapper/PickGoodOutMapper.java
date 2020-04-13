package team.bishe.wms.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import team.bishe.wms.pojo.PickGoodOutResp;

import java.util.List;

/**
 *拣选物品对外操作
 */
@Component
@Mapper
public interface PickGoodOutMapper {
    /*
     * @Author RenJian
     * @Description 根据拣选方式获取返回参数
     **/
    public List<PickGoodOutResp> pickGood(@Param("pickMode")String pickMode);
}

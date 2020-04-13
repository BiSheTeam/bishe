package team.bishe.wms.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import team.bishe.wms.pojo.PickGoodOutResp;

import java.util.List;

@Service
public interface PickGoodOutService {
    /*
     * @Author RenJian
     * @Description 根据拣选方式获取返回参数
     **/
    public List<PickGoodOutResp> pickGood(String pickMode);
}

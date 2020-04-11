package team.bishe.wms.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import team.bishe.wms.pojo.PickGoodOutResp;

@Service
public interface PickGoodOutService {
    /*
     * @Author RenJian
     * @Description 根据拣选方式获取返回参数
     **/
    public PickGoodOutResp pickGood(String pickMode);
}

package team.bishe.wms.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import team.bishe.wms.pojo.BusManagementReq;

/**
 * @ClassName BusManageMapper
 * @Description 业务管理
 * @Author RJ
 * @Date 2020/4/10 18:33
 * @Version 1.0
 **/
@Component
@Mapper
public interface BusManageMapper {
    /**
     * 卡用户冻结
     * @param
     * @return
     */
    public void cardFrozen(BusManagementReq busManagementReq);
    /**
     * 卡用户解冻
     * @param
     * @return
     */
    public void cardThaw(BusManagementReq busManagementReq);
}

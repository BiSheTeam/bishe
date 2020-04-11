package team.bishe.wms.service;

import org.springframework.stereotype.Service;
import team.bishe.wms.pojo.BusManagementReq;

/*
 * 业务管理
 */
@Service
public interface BusManageService {
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

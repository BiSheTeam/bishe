package team.bishe.wms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.bishe.wms.mapper.BusManageMapper;
import team.bishe.wms.pojo.BusManagementReq;
import team.bishe.wms.service.BusManageService;

/**
 * @ClassName BusManageServiceImpl
 * @Description
 * @Author RJ
 * @Date 2020/4/10 18:54
 * @Version 1.0
 **/
@Service
public class BusManageServiceImpl implements BusManageService {
    @Autowired
    private BusManageMapper busManageMapper;
    /**
     * 卡用户冻结
     * @param busManagementReq
     * @return
     */
    @Override
    public void cardFrozen(BusManagementReq busManagementReq) {
        busManageMapper.cardFrozen(busManagementReq);
    }

    /**
     * 卡用户解冻
     * @param busManagementReq
     * @return
     */
    @Override
    public void cardThaw(BusManagementReq busManagementReq) {
        busManageMapper.cardThaw(busManagementReq);
    }
}

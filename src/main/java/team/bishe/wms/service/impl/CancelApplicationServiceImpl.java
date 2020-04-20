package team.bishe.wms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import team.bishe.wms.mapper.ApplicationMapper;
import team.bishe.wms.service.CancelApplicationService;
//取消订单
public class CancelApplicationServiceImpl implements CancelApplicationService {
    @Autowired
    private ApplicationMapper applicationMapper;

    @Override
    public void cancelOrder(Integer applicationId) {
        applicationMapper.updateState(applicationId);
    }
}

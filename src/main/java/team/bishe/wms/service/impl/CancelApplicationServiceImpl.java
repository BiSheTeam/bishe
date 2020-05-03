package team.bishe.wms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.bishe.wms.mapper.ApplicationMapper;
import team.bishe.wms.mapper.DetailedEntryMapper;
import team.bishe.wms.mapper.WarehousingEntryMapper;
import team.bishe.wms.service.CancelApplicationService;
//取消订单
@Service
public class CancelApplicationServiceImpl implements CancelApplicationService {
    @Autowired
    private ApplicationMapper applicationMapper;
    @Autowired
    private WarehousingEntryMapper warehousingEntryMapper;
    @Autowired
    private DetailedEntryMapper detailedEntryMapper;

    @Override
    public void cancelOrder(String applicationId) {
        applicationMapper.updateState(applicationId);
        warehousingEntryMapper.updateState(applicationId);
    //    detailedEntryMapper.updateState(applicationId);
    }

}

package team.bishe.wms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.bishe.wms.mapper.OpenCardMapper;
import team.bishe.wms.pojo.OpencardReq;
import team.bishe.wms.service.OpenCardService;

/**
 * @ClassName OpenCardServiceImpl
 * @Description
 * @Author RJ
 * @Date 2020/4/10 17:38
 * @Version 1.0
 **/
@Service
public class OpenCardServiceImpl implements OpenCardService {
    @Autowired
    private OpenCardMapper openCardMapper;
    /**
     * 开卡申请->单卡开卡
     * @param opencardReq
     * @return
     */
    @Override
    public void openCard(OpencardReq opencardReq) {
        openCardMapper.openCard(opencardReq);
        openCardMapper.addCustomerInfo(opencardReq);
    }

    /**
     * 开卡申请->批量开卡
     * @param opencardReq
     * @return
     */
    @Override
    public void batchOpenCard(OpencardReq opencardReq) {
        int count = Integer.parseInt(opencardReq.getEndId()) - Integer.parseInt(opencardReq.getStartId()) + 1;
        int a = Integer.parseInt(opencardReq.getStartId());
        for (int i=0;i<count;i++){
            opencardReq.setCardId(String.valueOf(a));
            openCardMapper.openCard(opencardReq);
            a = ++a;
        }

    }
}

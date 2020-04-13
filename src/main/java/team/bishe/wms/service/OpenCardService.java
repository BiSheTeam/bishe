package team.bishe.wms.service;

import org.springframework.stereotype.Service;
import team.bishe.wms.pojo.OpencardReq;

/*
 * @Author RenJian
 * @Description 开卡申请
 * @Date 17:36 2020/4/10
 * @Param
 * @return
 **/
@Service
public interface OpenCardService {
    /**
     * 开卡申请->单卡开卡
     * @param
     * @return
     */
    public void openCard(OpencardReq opencardReq);
    /**
     * 开卡申请->批量开卡
     * @param
     * @return
     */
    public void batchOpenCard(OpencardReq opencardReq);
}

package team.bishe.wms.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import team.bishe.wms.pojo.OpencardReq;

/*开卡申请*/
@Component
@Mapper
public interface OpenCardMapper {
    /**
     * 开卡申请
     * @param
     * @return
     */
    public void openCard(OpencardReq opencardReq);
    /**
     * 开卡增加客户信息
     * @param
     * @return
     */
    public void addCustomerInfo(OpencardReq opencardReq);

}

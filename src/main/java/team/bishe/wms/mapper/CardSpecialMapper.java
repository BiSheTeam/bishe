package team.bishe.wms.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import team.bishe.wms.bean.TcifIdMap;
import team.bishe.wms.pojo.CardSpecialReq;

/**
 * @ClassName CardSpecialMapper
 * @Description
 * @Author RJ
 * @Date 2020/4/10 20:28
 * @Version 1.0
 **/
@Component
@Mapper
public interface CardSpecialMapper {
    /**
     * 卡挂失
     * @param
     * @return
     */
    public void cardLoss   (CardSpecialReq cardSpecialReq);
    /**
     * 卡解挂
     * @param
     * @return
     */
    public void cancelLoss   (CardSpecialReq cardSpecialReq);
    /**
     * 卡延期
     * @param
     * @return
     */
    public void cardDelay   (CardSpecialReq cardSpecialReq);
    /**
     * 退卡
     * @param
     * @return
     */
    public void cardRefund   (CardSpecialReq cardSpecialReq);
    /**
     * 查询验证信息
     * @param
     * @return
     */
     TcifIdMap queryValidatInfo   (CardSpecialReq cardSpecialReq);
}

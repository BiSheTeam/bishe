package team.bishe.wms.service;

import org.springframework.stereotype.Service;
import team.bishe.wms.pojo.CardSpecialReq;

/*
 * @Author RenJian
 * @Description 卡特殊处理
 **/
@Service
public interface CardSpecialService {
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
}

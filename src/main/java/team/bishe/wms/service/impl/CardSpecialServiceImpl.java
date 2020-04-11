package team.bishe.wms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.bishe.wms.bean.TcifIdMap;
import team.bishe.wms.mapper.CardSpecialMapper;
import team.bishe.wms.pojo.CardSpecialReq;
import team.bishe.wms.service.CardSpecialService;

/**
 * @ClassName CardSpecialServiceImpl
 * @Description
 * @Author RJ
 * @Date 2020/4/10 22:00
 * @Version 1.0
 **/
@Service
public class CardSpecialServiceImpl implements CardSpecialService {
    @Autowired
    private CardSpecialMapper cardSpecialMapper;
    /**
     * 卡挂失
     * @param cardSpecialReq
     * @return
     */
    @Override
    public void cardLoss(CardSpecialReq cardSpecialReq) {
        TcifIdMap info = cardSpecialMapper.queryValidatInfo(cardSpecialReq);
        if (info.getPidCd() == cardSpecialReq.getVerData() && info.getPidType() == cardSpecialReq.getVerType()){
            cardSpecialMapper.cardLoss(cardSpecialReq);
        }
    }

    /**
     * 卡解挂
     * @param cardSpecialReq
     * @return
     */
    @Override
    public void cancelLoss(CardSpecialReq cardSpecialReq) {
        TcifIdMap info = cardSpecialMapper.queryValidatInfo(cardSpecialReq);
        if (info.getPidCd() == cardSpecialReq.getVerData() && info.getPidType() == cardSpecialReq.getVerType()){
            cardSpecialMapper.cancelLoss(cardSpecialReq);
        }
    }

    /**
     * 卡延期
     * @param cardSpecialReq
     * @return
     */
    @Override
    public void cardDelay(CardSpecialReq cardSpecialReq) {
        cardSpecialMapper.cardDelay(cardSpecialReq);
    }

    /**
     * 退卡
     * @param cardSpecialReq
     * @return
     */
    @Override
    public void cardRefund(CardSpecialReq cardSpecialReq) {
        TcifIdMap info = cardSpecialMapper.queryValidatInfo(cardSpecialReq);
        if (info.getPidCd() == cardSpecialReq.getVerData() && info.getPidType() == cardSpecialReq.getVerType()){
            cardSpecialMapper.cardRefund(cardSpecialReq);
        }
    }
}

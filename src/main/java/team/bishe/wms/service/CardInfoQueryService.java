package team.bishe.wms.service;

import org.springframework.stereotype.Service;
import team.bishe.wms.bean.TcardInfo;
import team.bishe.wms.pojo.CardQueryReq;
import team.bishe.wms.pojo.CardQueryResp;

import java.util.List;

@Service
public interface CardInfoQueryService {
    /**
     *查询卡信息列表
     * @param
     * @return
     */
    public CardQueryResp<TcardInfo> cardInfoList  (CardQueryReq cardQueryReq);
    /**
     *查询卡信息详情
     * @param
     * @return
     */
    public TcardInfo cardInfoDetail  (CardQueryReq cardQueryReq);
    /**
     *查询开卡信息列表
     * @param
     * @return
     */
    public CardQueryResp<TcardInfo> openCardList  (CardQueryReq cardQueryReq);
    /**
     *查询开卡信息详情
     * @param
     * @return
     */
    public TcardInfo openCardDetail  (CardQueryReq cardQueryReq);
}

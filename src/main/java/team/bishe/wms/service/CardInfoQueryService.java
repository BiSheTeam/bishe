package team.bishe.wms.service;

import org.springframework.stereotype.Service;
import team.bishe.wms.bean.TcardInfo;
import team.bishe.wms.pojo.CardQueryReq;
import team.bishe.wms.pojo.QueryResp;

@Service
public interface CardInfoQueryService {
    /**
     *查询卡信息列表
     * @param
     * @return
     */
    public QueryResp<TcardInfo> cardInfoList  (CardQueryReq cardQueryReq);
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
    public QueryResp<TcardInfo> openCardList  (CardQueryReq cardQueryReq);
    /**
     *查询开卡信息详情
     * @param
     * @return
     */
    public TcardInfo openCardDetail  (CardQueryReq cardQueryReq);
}

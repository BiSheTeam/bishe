package team.bishe.wms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.bishe.wms.bean.TcardInfo;
import team.bishe.wms.mapper.CardInfoQueryMapper;
import team.bishe.wms.pojo.CardQueryReq;
import team.bishe.wms.pojo.CardQueryResp;
import team.bishe.wms.service.CardInfoQueryService;
import team.bishe.wms.util.PagesUtil;
import team.bishe.wms.util.TimeTrans;

import java.util.List;

/**
 * @ClassName CardInfoQueryServiceImpl
 * @Description
 * @Author RJ
 * @Date 2020/4/11 12:02
 * @Version 1.0
 **/
@Service
public class CardInfoQueryServiceImpl implements CardInfoQueryService {
    @Autowired
    private CardInfoQueryMapper cardInfoQueryMapper;

    /**
     * 查询卡信息列表
     * @param cardQueryReq
     * @return
     */
    @Override
    public CardQueryResp<TcardInfo> cardInfoList(CardQueryReq cardQueryReq) {
        Integer count = cardInfoQueryMapper.cardCount(cardQueryReq);
        CardQueryResp<TcardInfo> resp = new CardQueryResp<>();
        resp.setRecords(count);
        PagesUtil.pages().pageParam(cardQueryReq);
        List<TcardInfo> infos = cardInfoQueryMapper.cardInfoList(cardQueryReq);
        resp.setLists(infos);
        resp.setPageNumber(cardQueryReq.getPageIndex());
        resp.setPageSize(cardQueryReq.getPageSize());
        return resp;
    }

    /**
     * 查询卡信息详情
     * @param cardQueryReq
     * @return
     */
    @Override
    public TcardInfo cardInfoDetail(CardQueryReq cardQueryReq) {
        TcardInfo tcardInfo = cardInfoQueryMapper.cardInfoDetail(cardQueryReq);
        return tcardInfo;
    }

    /**
     * 查询开卡信息列表
     * @param cardQueryReq
     * @return
     */
    @Override
    public CardQueryResp<TcardInfo> openCardList(CardQueryReq cardQueryReq) {
        TimeTrans timeTrans = new TimeTrans();
        CardQueryResp<TcardInfo> resp = new CardQueryResp<>();
        String startDt = timeTrans.intDateFormat("yyyyMMdd", cardQueryReq.getStartDt());
        String endDt = timeTrans.intDateFormat("yyyyMMdd", cardQueryReq.getEndDt());
        cardQueryReq.setEndDt(endDt);
        cardQueryReq.setStartDt(startDt);
        Integer count = cardInfoQueryMapper.openCardCount(cardQueryReq);
        resp.setRecords(count);
        PagesUtil.pages().pageParam(cardQueryReq);
        List<TcardInfo> infos = cardInfoQueryMapper.openCardList(cardQueryReq);
        resp.setLists(infos);
        resp.setPageNumber(cardQueryReq.getPageIndex());
        resp.setPageSize(cardQueryReq.getPageSize());
        return resp;
    }

    /**
     * 查询开卡信息详情
     * @param cardQueryReq
     * @return
     */
    @Override
    public TcardInfo openCardDetail(CardQueryReq cardQueryReq) {
        return cardInfoQueryMapper.openCardDetail(cardQueryReq);
    }
}

package team.bishe.wms.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.bishe.wms.bean.TcardDoc;
import team.bishe.wms.bean.TcardInfo;
import team.bishe.wms.bean.TcardUse;
import team.bishe.wms.controller.CommonController;
import team.bishe.wms.mapper.CardDocMapper;
import team.bishe.wms.pojo.BrandResp;
import team.bishe.wms.pojo.CardQueryReq;
import team.bishe.wms.pojo.QueryResp;
import team.bishe.wms.service.CardService;
import team.bishe.wms.util.PagesUtil;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @ClassName cardServiceImpl
 * @Description
 * @Author RJ
 * @Date 2020/4/9 21:38
 * @Version 1.0
 **/
@Slf4j
@Service
public class cardServiceImpl implements CardService {
    @Autowired
    private CardDocMapper cardUseMapper;
    @Autowired
    private CommonController commonController;
    /**
     * 查询可用号段
     * @return
     */
    @Override
    public List<TcardUse> queryUsabelNum() {
        List<TcardUse> tcardUses = cardUseMapper.queryUsabelNum();
        return tcardUses;
    }

    /**
     * 卡档申请
     * @return
     */
    @Override
    public void makeCardDoc(TcardDoc tcardDoc) {
        BrandResp brandResp = cardUseMapper.queryBrandNm(Integer.parseInt(tcardDoc.getBrandId()));
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmm");
        String date = df.format(new Date());
        String replace = date.replace("2020", "2021");
        tcardDoc.setBrhId("0");
        tcardDoc.setAppDt(date);
        tcardDoc.setBrandNm(brandResp.getBrandDesc());
        tcardDoc.setCardType("实体卡");
        tcardDoc.setTotValue(5000);
        tcardDoc.setStartDt(date);
        tcardDoc.setEndDt(replace);
        tcardDoc.setPayMo("现金");
        tcardDoc.setCardBrhId("0");
        tcardDoc.setFlag("实名");
        tcardDoc.setStat("待审核");
        tcardDoc.setLastUpdBrhId("0");
        tcardDoc.setLastUpdTxnCd("制卡申请");
        tcardDoc.setLastUpdTs(date);
        cardUseMapper.makeCardDoc(tcardDoc);
    }

    /**
     * 卡品牌信息查询
     * @return
     */
    @Override
    public List<BrandResp> queryCardBrandInfo() {
        return cardUseMapper.queryCardBrandInfo();
    }

    /**
     * 卡档信息查询
     * @return
     */
    @Override
    public QueryResp<TcardDoc> cardDocList(CardQueryReq cardQueryReq) {
        QueryResp<TcardDoc> resp = new QueryResp<>();
        Integer count = cardUseMapper.docCount();
        PagesUtil.pages().pageParam(cardQueryReq);
        List<TcardDoc> tcardDocs = cardUseMapper.cardDocList(cardQueryReq);
        resp.setRecords(count);
        resp.setLists(tcardDocs);
        resp.setPageNumber(cardQueryReq.getPageIndex());
        resp.setPageSize(cardQueryReq.getPageSize());
        return resp;
    }

    /**
     * 卡档信息撤销
     * @return
     */
    @Override
    public void cardDocCancel(Integer docAppId) {
        cardUseMapper.cardDocCancel(docAppId);
    }

    /**
     * 卡档信息入库
     * @param tcardDoc@return
     */
    @Override
    public void cardDocIndepot(TcardDoc tcardDoc,TcardInfo tcardInfo) {
        SimpleDateFormat fm = new SimpleDateFormat("yyyyMMddHHmmss");
        //查询卡品牌名称

        tcardInfo.setBrhId("0");
        tcardInfo.setBrandId(tcardDoc.getBrandId());
        tcardInfo.setBuyBrhId("0");
        tcardInfo.setCardSta("未激活");
        tcardInfo.setLastUpdBrhId("0");
        tcardInfo.setLastUpdTs(fm.format(new Date()));
        int a = Integer.parseInt(tcardDoc.getStartId());
        int count = Integer.parseInt(tcardDoc.getEndId())- Integer.parseInt(tcardDoc.getStartId()) + 1;
        for (int i=0;i<count;i++){
            tcardInfo.setCardId(Integer.toString(a));
            a=a+1;
            cardUseMapper.cardDocIndepot(tcardInfo);
        }
        System.out.println("开始入库");
        cardUseMapper.updateDocSta(tcardDoc.getDocAppId());
    }

    /**
     * 卡档信息拒绝后更新卡档状态
     *
     * @param docAppId@return
     */
    @Override
    public void cardDocRefuse(Integer docAppId) {
        cardUseMapper.cardDocRefuse(docAppId);
    }

    /**
     * 查询被拒绝卡档信息列表
     * @return
     */
    @Override
    public QueryResp<TcardDoc> cardDocRefList(CardQueryReq cardQueryReq) {
        QueryResp<TcardDoc> resp = new QueryResp<>();
        Integer count = cardUseMapper.docRefCount();
        PagesUtil.pages().pageParam(cardQueryReq);
        List<TcardDoc> tcardDocs = cardUseMapper.cardDocRefList(cardQueryReq);
        resp.setRecords(count);
        resp.setLists(tcardDocs);
        resp.setPageNumber(cardQueryReq.getPageIndex());
        resp.setPageSize(cardQueryReq.getPageSize());
        return  resp;
    }



}

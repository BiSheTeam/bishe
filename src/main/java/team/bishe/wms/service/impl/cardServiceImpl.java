package team.bishe.wms.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.bishe.wms.bean.TbrandInfo;
import team.bishe.wms.bean.TcardDoc;
import team.bishe.wms.bean.TcardInfo;
import team.bishe.wms.bean.TcardUse;
import team.bishe.wms.controller.CommonController;
import team.bishe.wms.mapper.CardDocMapper;
import team.bishe.wms.service.CardService;

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
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmm");
        String date = df.format(new Date());
        String replace = date.replace("2020", "2021");
        tcardDoc.setBrhId("0");
        tcardDoc.setAppDt(date);
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
    public List<TbrandInfo> queryCardBrandInfo() {
        return cardUseMapper.queryCardBrandInfo();
    }

    /**
     * 卡档信息查询
     * @return
     */
    @Override
    public List<TcardDoc> cardDocList() {
        return cardUseMapper.cardDocList();
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
    public List<TcardDoc> cardDocRefList() {
        return cardUseMapper.cardDocRefList();
    }

}

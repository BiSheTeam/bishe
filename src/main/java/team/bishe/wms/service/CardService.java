package team.bishe.wms.service;


import org.springframework.stereotype.Service;
import team.bishe.wms.bean.TcardDoc;
import team.bishe.wms.bean.TcardInfo;
import team.bishe.wms.bean.TcardUse;
import team.bishe.wms.pojo.BrandResp;
import team.bishe.wms.pojo.CardQueryReq;
import team.bishe.wms.pojo.QueryResp;

import java.util.List;

@Service
public interface CardService {
    /**
     * 查询可用号段
     * @param
     * @return
     */
    public List<TcardUse> queryUsabelNum();
    /**
     * 卡档申请
     * @param
     * @return
     */
    public void makeCardDoc(TcardDoc tcardDoc);
    /**
     * 卡品牌信息查询
     * @param
     * @return
     */
    List<BrandResp>  queryCardBrandInfo();
    /**
     * 卡档信息查询
     * @param
     * @return
     */
    QueryResp<TcardDoc> cardDocList(CardQueryReq cardQueryReq);
    /**
     * 卡档信息撤销
     * @param
     * @return
     */
    public void cardDocCancel(Integer docAppId);
    /**
     * 卡档信息入库
     * @param
     * @return
     */
    public void cardDocIndepot(TcardDoc tcardDoc, TcardInfo tcardInfo);
    /**
     * 卡档信息拒绝后更新卡档状态
     * @param
     * @return
     */
    public  void cardDocRefuse(Integer docAppId);
    /**
     * 查询被拒绝卡档信息列表
     * @param
     * @return
     */
    QueryResp<TcardDoc> cardDocRefList(CardQueryReq cardQueryReq);
}

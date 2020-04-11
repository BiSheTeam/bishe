package team.bishe.wms.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import team.bishe.wms.bean.TcardInfo;
import team.bishe.wms.pojo.CardQueryReq;

import java.util.List;

/*
 * @Author RenJian
 * @Description 卡信息查询
 **/
@Component
@Mapper
public interface CardInfoQueryMapper {
    /**
     *查询卡信息列表
     * @param
     * @return
     */
    public List<TcardInfo> cardInfoList  (CardQueryReq cardQueryReq);
    /**
     *查询卡信息列表总记录数
     * @param
     * @return
     */
    public Integer cardCount  (CardQueryReq cardQueryReq);
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
    public List<TcardInfo> openCardList  (CardQueryReq cardQueryReq);
    /**
     *查询卡信息列表总记录数
     * @param
     * @return
     */
    public Integer openCardCount  (CardQueryReq cardQueryReq);
    /**
     *查询开卡信息详情
     * @param
     * @return
     */
    public TcardInfo openCardDetail  (CardQueryReq cardQueryReq);
}

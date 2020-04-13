package team.bishe.wms.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import team.bishe.wms.bean.TbrandInfo;
import team.bishe.wms.bean.TcardDoc;
import team.bishe.wms.bean.TcardInfo;
import team.bishe.wms.bean.TcardUse;
import java.util.List;

@Component
@Mapper
public interface CardDocMapper {
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
    List<TbrandInfo>  queryCardBrandInfo();
    /**
     * 卡档信息查询
     * @param
     * @return
     */
    List<TcardDoc> cardDocList();
    /**
     * 卡档信息撤销
     * @param
     * @return
     */
    public void cardDocCancel(@Param("docAppId") Integer docAppId);
    /**
     * 卡档信息入库
     * @param
     * @return
     */
    public void cardDocIndepot(TcardInfo tcardInfo);
    /**
     * 卡档信息入库后更新卡档状态
     * @param
     * @return
     */
    public void updateDocSta(@Param("docAppId")Integer docAppId);
    /**
     * 卡档信息拒绝后更新卡档状态
     * @param
     * @return
     */
    public  void cardDocRefuse(@Param("docAppId")Integer docAppId);
    /**
     * 查询被拒绝卡档信息列表
     * @param
     * @return
     */
    List<TcardDoc> cardDocRefList();
}

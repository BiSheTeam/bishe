package team.bishe.wms.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import team.bishe.wms.bean.PickForm;
import team.bishe.wms.bean.WgoodsInfo;
import team.bishe.wms.pojo.PickGoodInReq;

import java.util.List;

/*
 * @Author RenJian
 * @Description 拣选物品对内接口
*/
@Component
@Mapper
public interface PickGoodInMapper {
    /*
     * @Author RenJian
     * @Description 生成拣选货物单接口
     **/
    void makePickForm(PickForm pickForm);
    /*
     * @Author RenJian
     * @Description 根据客户ID查询物品信息
     **/
    WgoodsInfo queryGoodInfo(@Param("custId")String custId);
    /*
     * @Author RenJian
     * @Description 查询拣货单
     **/
    List<PickForm> queryPickForm(@Param("custId") String custId);
    /*
     * @Author RenJian
     * @Description 删除拣货单
     **/
    void delPickForm(@Param("gFormId")String gFormId);


}

package team.bishe.wms.service;

import org.springframework.stereotype.Service;
import team.bishe.wms.bean.PickForm;
import team.bishe.wms.pojo.PickGoodInReq;

import java.util.List;

/*
 * @Author RenJian
 * @Description  货物拣选对内接口
 **/
@Service
public interface PickGoodInService {
    /*
     * @Author RenJian
     * @Description 生成拣选货物单接口
     **/
    void makePickForm(PickGoodInReq pickGoodInReq);
    /*
     * @Author RenJian
     * @Description 查询拣货单
     **/
    List<PickForm> queryPickForm(String custId);
    /*
     * @Author RenJian
     * @Description 删除拣货单
     **/
    void delPickForm(String gFormId);
}

package team.bishe.wms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.bishe.wms.bean.PickForm;
import team.bishe.wms.bean.WgoodsInfo;
import team.bishe.wms.mapper.PickGoodInMapper;
import team.bishe.wms.pojo.PickGoodInReq;
import team.bishe.wms.service.PickGoodInService;

import java.util.List;

/**
 * @ClassName PickGoodInServiceImpl
 * @Description
 * @Author RJ
 * @Date 2020/4/11 17:29
 * @Version 1.0
 **/
@Service
public class PickGoodInServiceImpl implements PickGoodInService {
    @Autowired
    private PickGoodInMapper pickGoodInMapper;

    @Override
    public void makePickForm(PickGoodInReq pickGoodInReq) {
        WgoodsInfo wgoodsInfo = pickGoodInMapper.queryGoodInfo(pickGoodInReq.getCustId());
        PickForm pickForm = new PickForm();
        pickForm.setCustId(pickGoodInReq.getCustId());
        pickForm.setGoodNm(wgoodsInfo.getGoodNm());
        pickForm.setGoodNum(wgoodsInfo.getNumber());
        pickForm.setGoodUnit(wgoodsInfo.getGoodUnit());
        pickForm.setPickMode(pickGoodInReq.getPickMode());
        pickForm.setPickSta("待拣选");
        pickForm.setgPosId(wgoodsInfo.getgPosId());
        pickGoodInMapper.makePickForm(pickForm);
    }

    @Override
    public List<PickForm> queryPickForm(String custId) {
        List<PickForm> pickForms = pickGoodInMapper.queryPickForm(custId);
        return pickForms;
    }

    @Override
    public void delPickForm(String gFormId) {
        pickGoodInMapper.delPickForm(gFormId);
    }
}

package team.bishe.wms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.bishe.wms.mapper.PickGoodOutMapper;
import team.bishe.wms.pojo.PickGoodOutResp;
import team.bishe.wms.service.PickGoodOutService;

import java.util.List;

/**
 * @ClassName PickGoodOutServiceImpl
 * @Description
 * @Author RJ
 * @Date 2020/4/11 15:45
 * @Version 1.0
 **/
@Service
public class PickGoodOutServiceImpl implements PickGoodOutService {
    @Autowired
    private PickGoodOutMapper pickGoodOutMapper;
    @Override
    public List<PickGoodOutResp> pickGood(String pickMode) {
        return pickGoodOutMapper.pickGood(pickMode);
    }
}

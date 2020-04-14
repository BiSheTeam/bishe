package team.bishe.wms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.bishe.wms.bean.Position;
import team.bishe.wms.bean.Warehouse;
import team.bishe.wms.mapper.PositionMapper;
import team.bishe.wms.service.PositionService;
import team.bishe.wms.util.MyPageUtil;

import java.util.List;

@Service("positionService")
public class PositionServiceImpl implements PositionService {
    @Autowired
    PositionMapper positionMapper;

    @Override
    public List<Position> queryPositionList() {
        return positionMapper.queryPositionList();
    }

    @Override
    public Position queryById(String id) {
        return positionMapper.queryById(id);
    }

    @Override
    public List<Position> queryPage(int page, int num) {
        if (Position.isUPDATED()) {
            Position.setCOUNT(positionMapper.queryCount());
            Position.setUPDATED(true);
        }
        int start = MyPageUtil.convert(page, num, Position.getCOUNT());
        return positionMapper.queryPage(start, num);
    }

    @Override
    public int update(Position position) {
        return positionMapper.update(position);
    }

    @Override
    public int deleteById(String id) {
        if (positionMapper.queryTrayCount(id) != 0) return -1;
        //在中间表中删除此仓位记录
        positionMapper.deleteWhPos(id);
        return positionMapper.deleteById(id);
    }

    @Override
    public int insert(Position position, String whid) {
        int n = positionMapper.insert(position);
        positionMapper.setNewPosWh(position.getId(), whid);
        return n;
    }
}

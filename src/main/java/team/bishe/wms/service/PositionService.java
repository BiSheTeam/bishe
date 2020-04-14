package team.bishe.wms.service;

import team.bishe.wms.bean.Position;
import team.bishe.wms.bean.Warehouse;

import java.util.List;

public interface PositionService {
    List<Position> queryPositionList();

    Position queryById(String id);

    List<Position> queryPage(int page, int num);

    int update(Position position);

    int deleteById(String id);

    int insert(Position position, String whid);
}

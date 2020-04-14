package team.bishe.wms.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import team.bishe.wms.bean.Position;
import team.bishe.wms.bean.Warehouse;

import java.util.List;

@Repository
public interface PositionMapper {
    List<Position> queryPositionList();

    Position queryById(String posid);

    List<Position> queryByWhId(String whid);

    int queryCount();

    List<Position> queryPage(@Param("start") int start, @Param("num") int num);

    int update(Position position);

    int deleteById(String id);

    int insert(Position position);

    int setNewPosWh(@Param("posid") String posid, @Param("whid") String whid);

    int queryTrayCount(String id);

    int deleteWhPos(String id);
}
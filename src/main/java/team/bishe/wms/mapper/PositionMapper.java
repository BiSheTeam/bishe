package team.bishe.wms.mapper;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import team.bishe.wms.bean.Position;

import java.util.List;

@Repository
public interface PositionMapper {
    List<Position> queryPositionList();

    Position queryById(String posid);

    List<Position> queryByWhId(String whid);
}
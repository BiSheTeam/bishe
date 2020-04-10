package team.bishe.wms.mapper;

import org.springframework.stereotype.Repository;
import team.bishe.wms.bean.Tray;

import java.util.List;

@Repository
public interface TrayMapper {
    List<Tray> queryTrayList();
    Tray queryById(String id);

    List<Tray> queryByPosId(String posid);
}
package team.bishe.wms.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import team.bishe.wms.bean.Tray;

import java.util.List;

@Repository
public interface TrayMapper {
    List<Tray> queryTrayList();

    Tray queryById(String id);

    List<Tray> queryByPosId(String posid);

    int queryCount();

    List<Tray> queryPage(@Param("start") int start, @Param("num") int num);

    int update(Tray tray);

    int deleteById(String id);

    int insert(Tray tray);

    int setNewPosWh(@Param("trayid") String trayid, @Param("posid") String posid);

    int updatePosTray(@Param("trayid") String trayid, @Param("posid") String posid);

    int updateTpid(@Param("trayid") String trayid, @Param("posid") String posid);

    void deletePosWh(String id);
}
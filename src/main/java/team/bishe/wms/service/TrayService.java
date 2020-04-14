package team.bishe.wms.service;

import team.bishe.wms.bean.Tray;

import java.util.List;

public interface TrayService {
    List<Tray> queryTrayList();

    Tray queryById(String id);

    List<Tray> queryPage(int page, int num);

    int update(Tray tray);

    int deleteById(String id);

    int insert(Tray tray, String posid);

    int updatePosTray(String trayid, String posid);
}

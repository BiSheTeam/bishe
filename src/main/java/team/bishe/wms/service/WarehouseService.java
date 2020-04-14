package team.bishe.wms.service;

import team.bishe.wms.bean.Warehouse;

import java.util.List;

public interface WarehouseService {
    List<Warehouse> queryAll();

    List<Warehouse> queryPage(int start, int num);

    Warehouse queryById(String whid);

    int update(Warehouse warehouse);

    int deleteById(String id);

    int insetrt(Warehouse warehouse);
}
